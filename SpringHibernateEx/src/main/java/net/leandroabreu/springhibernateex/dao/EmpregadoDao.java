package net.leandroabreu.springhibernateex.dao;

import java.util.List;

import net.leandroabreu.springhibernateex.model.Empregado;

public interface EmpregadoDao {

    void saveEmpregado(Empregado empregado);

    List<Empregado> findAllEmpregados();

    void deleteEmpregadoByMatricula(String matricula);

}
