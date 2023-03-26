package com.rafael.agenda.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rafael.agenda.model.AgendaModel;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;


@CrossOrigin
@RestController
@RequestMapping("agenda")
public class AgendaController {
    @GetMapping
    public List<AgendaModel> getAgenda(){
        List<AgendaModel>list = new ArrayList<AgendaModel>();
        list.add(new AgendaModel("Rafael", "19", "rr337262@gmail.com", "81997366160", "Rua Dona Inês"));
        list.add(new AgendaModel("Lucas", "33", "lucas24@gmail.com", "81987223099", "Av Recife"));
        list.add(new AgendaModel("Roberto", "12", "roobertinhogameplays@gmail.com", "11996316600", "Rua dos Coqueiros"));
        list.add(new AgendaModel("Luiz", "44", "luizsantos22@hotmail.com", "40028922", "Av. Gen. Ataliba Leonel"));
        list.add(new AgendaModel("Andre", "25", "an12890@gmail.com", "81974669981", "Rua Santos Dumont"));
        
        return list;
    }
    
}
