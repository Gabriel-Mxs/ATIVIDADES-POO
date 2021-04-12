package com.mycompany.aula1503;

public class Produto {
    int codigo;
    String modelo;
    String categoria;
    String nome;
    double valorCompra;
    double valorVenda;
    int quantidade;
    
    public void imprimir() {
        System.out.println("CADASTRO PRODUTO");
        System.out.println("Codigo: " + this.nome);
        System.out.println("Modelo: " + this.cpf);
        System.out.println("Categoria: " + this.agencia);
        System.out.println("nome: " + this.contaCorrente);
        System.out.println("Valor compra: " + this.endereco);
        System.out.println("Valor venda: " + this.telefone);
        System.out.println("Quantidade: " + this.quantidade);
    }
    
    public double calcularDiferenca() {
        return this.valorVenda - this.valorCompra;
        
    }
}

