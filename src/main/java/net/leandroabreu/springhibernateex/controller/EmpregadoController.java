package net.leandroabreu.springhibernateex.controller;

import java.util.List;

import javax.validation.Valid;

import net.leandroabreu.springhibernateex.model.Empregado;
import net.leandroabreu.springhibernateex.service.EmpregadoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class EmpregadoController {

    @Autowired
    EmpregadoService service;

    @RequestMapping(value = { "/", "/list" })
    public String listEmpregados(ModelMap model) {
        List<Empregado> empregados = service.findAllEmpregados();
        model.addAttribute("empregados", empregados);
        return "empregados";
    }

    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String newEmpregado(ModelMap model) {
        Empregado empregado = new Empregado();
        model.addAttribute("empregado", empregado);
        return "registro";
    }

    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public String saveEmpregado(@Valid Empregado empregado,
            BindingResult result, ModelMap model) {

        if (result.hasErrors()) {
            return "registro";
        }

        service.saveEmpregado(empregado);

        model.addAttribute("success", "Empregado " + empregado.getNome()
                + " incluído com sucesso.");
        return "sucesso";
    }

    @RequestMapping(value = { "/delete/{matricula}/empregado" }, method = RequestMethod.GET)
    public String deleteEmpregado(@PathVariable String matricula) {
        service.deleteEmpregadoByMatricula(matricula);

        return "redirect:/list";
    }

}
