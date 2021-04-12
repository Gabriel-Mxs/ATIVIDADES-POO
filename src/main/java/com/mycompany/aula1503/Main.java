package com.mycompany.aula1503;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Cadastro de Cliente");
        Cliente cliente = new Cliente(); //Instanciei um objeto      
        System.out.println("Digite o nome");
        cliente.nome = scan.next();
        System.out.println("Digite o cpf");
        cliente.cpf = scan.next();
        System.out.println("Digite a agencia");
        cliente.agencia = scan.next();
        System.out.println("Digite a Conta Corrente");
        cliente.contaCorrente = scan.next();
        System.out.println("Digite o endereco");
        cliente.endereco = scan.next();
        System.out.println("Digite o telefone");
        cliente.telefone = scan.next();
        cliente.imprimir();
       
        
        
        Cliente cliente2 = new Cliente(); //Instaciando um novo objeto
        System.out.println("Digite o nome");
        cliente2.nome = scan.next();
        System.out.println("Digite o cpf");
        cliente2.cpf = scan.next();
        System.out.println("Digite a agencia");
        cliente2.agencia = scan.next();
        System.out.println("Digite a Conta Corrente");
        cliente2.contaCorrente = scan.next();
        System.out.println("Digite o endereco");
        cliente2.endereco = scan.next();
        System.out.println("Digite o telefone");
        cliente2.telefone = scan.next();
        cliente2.imprimir();     
     
        System.out.println("Cadastro de Produto");
        Produto produto = new Produto();
        System.out.println("Digite o codigo");
        produto.codigo = scan.nextInt();
        System.out.println("Digite o modelo");
        produto.modelo = scan.next();
        System.out.println("Digite a categoria");
        produto.categoria = scan.next();
        System.out.println("Digite o nome");
        produto.nome = scan.next();
        System.out.println("Digite o valor da compra");
        produto.valorCompra = scan.nextInt();
        System.out.println("Digite o valor da venda");
        produto.valorVenda = scan.nextInt();
        System.out.println("Digite a quantidade");
        produto.quantidade = scan.nextInt();
        
        
        scan.close();
        
    }
    
}/* int codigo;
    String modelo;
    String categoria;
    String nome;
    double valorCompra;
    double valorVenda;
    int quantidade;*/
