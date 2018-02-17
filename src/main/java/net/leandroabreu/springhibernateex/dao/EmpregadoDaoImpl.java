package net.leandroabreu.springhibernateex.dao;

import java.util.List;

import net.leandroabreu.springhibernateex.model.Empregado;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

@Repository("empregadoDao")
public class EmpregadoDaoImpl extends AbstractDao implements EmpregadoDao {

    @Override
    public void saveEmpregado(Empregado empregado) {
        persist(empregado);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Empregado> findAllEmpregados() {
        Criteria criteria = getSession().createCriteria(Empregado.class);
        return (List<Empregado>) criteria.list();
    }

    @Override
    public void deleteEmpregadoByMatricula(String matricula) {
        Query query = getSession().createSQLQuery(
                "delete from EMPREGADO where MATRICULA = :matricula");
        query.setString("matricula", matricula);
        query.executeUpdate();
    }

}
