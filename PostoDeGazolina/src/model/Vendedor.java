/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author tadeu
 */
public class  Vendedor {
    private ArrayList<Item> combustivel = new ArrayList<>();
    private ArrayList<Item> oleoMotor = new ArrayList<>();
    private ArrayList<Double> custos = new ArrayList<>();
    
    
    /**
     * @param indice
     * @return the combustivel
     */
    public Item getCombustivel(int indice) {
        return combustivel.get(indice);
    }

    /**
     * @param combustivel the combustivel to set
     */
    public void setCombustivel(Item combustivel) {
        this.combustivel.add(combustivel);
    }
    
    
    /**
     * @param indice
     * @return the oleoMotor
     */
    public Item getOleoMotor(int indice) {
        return oleoMotor.get(indice);
    }

    /**
     * @param oleoMotor the oleoMotor to set
     */
    public void setOleoMotor(Item oleoMotor) {
        this.oleoMotor.add(oleoMotor);
    }
    /**
     * @param quantidade em ml para o abastecimento
     * @param indice posição que representa o combustivel
     * @return o valor da compra de combustivel
     */
    public double venderCombustivel(int quantidade, int indice){
        boolean vendeu = this.combustivel.get(indice).esvaziar(quantidade);
        double custo = vendeu ? ((this.combustivel.get(indice).getValor()*0.001)*quantidade) : 0.0;
        this.setCustos(custo);
        return custo;
    }
    /**
     * @param quantidade em unidades comsumidas
     * @param indice posição que representa o óleo motor
     * @return o valor da compra de óleo motor
     */
    public double venderOleoMotor(int quantidade, int indice){
        boolean vendeu = this.oleoMotor.get(indice).esvaziar(quantidade);
        double custo = vendeu ? (this.combustivel.get(indice).getValor()*quantidade) : 0.0;
        this.setCustos(custo);
        return custo;
    }

    /**
     * @param indice
     * @return the custo
     */
    public Double getCustos(int indice) {
        return this.custos.get(indice);
    }

    /**
     * @param custo the custo to set
     */
    public void setCustos(Double custo) {
        this.custos.add(custo);
    }
    /**
     * 
     * @return total valor da compra
     */
    public double calcular(int dias){
        double total = 0.0;
        for(double custo : this.custos){
           total +=  custo;
        }
        if(dias == 0){
            total -= total*0.1;
        }else if(dias > 0 && dias <= 30){
            total += total*0.1;
        }
        return total;
    }
    /**
     * limpa os custos
     */
    public void novoCalculo(){
        this.custos.clear();
    }
    
    
}
