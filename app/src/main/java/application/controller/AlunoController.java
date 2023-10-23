package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import application.model.AlunoRepository;

@Controller
@RequestMapping("/aluno")
public class AlunoController {
    @Autowired
    AlunoRepository alunoRepo;

    @RequestMapping("/insert")
    public String insert() {
        return "/aluno/insert";
    }

    @RequestMapping(value="/insert", method=RequestMethod.POST)
    public String insert() {
        return "";
    }
}
