package net.leandroabreu.springhibernateex.service;

import java.util.List;

import javax.transaction.Transactional;

import net.leandroabreu.springhibernateex.dao.EmpregadoDao;
import net.leandroabreu.springhibernateex.model.Empregado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("empregadoService")
@Transactional
public class EmpregadoServiceImpl implements EmpregadoService {

    @Autowired
    private EmpregadoDao dao;

    @Override
    public void saveEmpregado(Empregado empregado) {
        dao.saveEmpregado(empregado);

    }

    @Override
    public List<Empregado> findAllEmpregados() {
        return dao.findAllEmpregados();
    }

    @Override
    public void deleteEmpregadoByMatricula(String matricula) {
        dao.deleteEmpregadoByMatricula(matricula);

    }

}
