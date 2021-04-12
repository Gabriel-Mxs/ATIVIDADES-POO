package com.mycompany.aula1503;

public class Cliente {
    
    //VISIBILIDADE: privado - private, publico - public e protegido - protected
    //ENCAPSULAMENTO
    
    String nome;
    String cpf;
    String agencia;
    String contaCorrente;
    String endereco;
    String telefone;

    public Cliente() { //CONSTRUTOR
    }
    

public void imprimir() {
        System.out.println("CADASTRO CLIENTE");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Conta Corrente: " + this.contaCorrente);
        System.out.println("Endereco: " + this.endereco);
        System.out.println("Telefone: " + this.telefone);
     }

}