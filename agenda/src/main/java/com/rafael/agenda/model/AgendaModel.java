package com.rafael.agenda.model;

public class AgendaModel {
    String nome;
    String idade;
    String email;
    String telefone;
    String endereco;

    public AgendaModel(String nome, String idade, String email, String telefone, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNome(){
        return nome;
    }

    public String getIdade(){
        return idade;
    }

    public String getEmail(){
        return email;
    }

    public String getTelefonne(){
        return telefone;
    }

    public String getEndereco(){
        return endereco;
    }


}
