package net.leandroabreu.springhibernateex.service;

import java.util.List;

import net.leandroabreu.springhibernateex.model.Empregado;

public interface EmpregadoService {

    void saveEmpregado(Empregado empregado);

    List<Empregado> findAllEmpregados();

    void deleteEmpregadoByMatricula(String matricula);

}
