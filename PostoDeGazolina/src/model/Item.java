/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author tadeu
 */
public class Item {
    private int quantidade;
    private double valor;
    private String nome;

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    private void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor valor do custo por litro em caso de se tratar de um combustivel ou unidade caso for óleo motor
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * @param quantidade valor que será retirado da this.quandidade
     */
    public boolean esvaziar(int quantidade){
        if(quantidade > this.quantidade){
            return false;
        }else{
            quantidade = this.quantidade - quantidade;
            this.setQuantidade(quantidade);
            return true;
        }
    }
    /*
     * @param quantidade valor que será acrecido da this.quandidade
     */
    public void abastecer(int quantidade){
        quantidade+= this.quantidade;
        this.setQuantidade(quantidade);
    }
    
}
