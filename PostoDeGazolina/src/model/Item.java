/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Controls.ExceptionReservatorio;

/**
 *
 * @author Tadeu
 */
public class Item {
    private int quantidadeAtual;
    private double valor;
    private String nome;
    private int quantidadeMax;
    private int quantidadeMin;

    
    
    
    /**
     * 
     * @param tipoCombustivel - nome do combustivel do reservatório
     * @param qtdMinima - quantidade mínima desejável no reservatório (abaixo deste limite pode ser emitido um alerta)
     * @param qtdMaxima - quantidade máxima - limite máximo de combustível no reservatório
     */
    public Item(String tipoCombustivel, int qtdMaxima, int qtdMinima) {
        this.nome = tipoCombustivel;
        this.quantidadeAtual = 0;
        this.quantidadeMax = qtdMaxima;
        this.quantidadeMin = qtdMinima;
    }
    /**
     * @return the quantidade
     */
    public int getQuantidadeAtual() {
        return quantidadeAtual;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidadeAtual(int quantidade) {
        this.quantidadeAtual = quantidade;
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
     * @return the quantidadeMax
     */
    public int getQuantidadeMax() {
        return quantidadeMax;
    }

    /**
     * @param quantidadeMax the quantidadeMax to set
     */
    public void setQuantidadeMax(int quantidadeMax) {
        this.quantidadeMax = quantidadeMax;
    }

    /**
     * @return the quantidadeMim
     */
    public int getQuantidadeMin() {
        return quantidadeMin;
    }

    /**
     * @param quantidadeMim the quantidadeMim to set
     */
    public void setQuantidadeMin(int quantidadeMin) {
        this.quantidadeMin = quantidadeMin;
    }
    
    public void retirar(int qtd) throws ExceptionReservatorio{
        if (qtd <= this.quantidadeAtual) {
            this.quantidadeAtual -= qtd;
        } else {
            throw new ExceptionReservatorio("Reservatório vazio!!");
        }
    }
    
    public void repor(int qtd) {
        this.quantidadeAtual += qtd;
    }
}
    

