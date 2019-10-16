/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Controls.ExceptionReservatorio;
import java.util.ArrayList;
import java.util.Set;
/**
 *
 * @author Tadeu
 */
public class Vendedor {
    private static ArrayList<Item> combustivel = new ArrayList<>();
    private static ArrayList<Item> oleoMotor = new ArrayList<>();
    
    
    
    public Vendedor(){
       Item diesel = new Item("Diesel", 100, 0);
       this.setCombustivel(diesel);
       Item gasComum = new Item("Gas.Comum", 100, 0);
       this.setCombustivel(gasComum);
       Item gasAditivada = new Item("Gas.Aditivada", 100, 0);
       this.setCombustivel(gasAditivada);
       Item Alcool = new Item("Alcool", 100, 0);
       this.setCombustivel(Alcool);
       Item frasco500 = new Item("Frasco 500 ml", 50, 0);
       this.setOleoMotor(frasco500);
       Item frasco1 = new Item("Frasco 1 Lt", 50, 0);
       this.setOleoMotor(frasco1);
       
        
       
    
    }
    public Item getCombustivel(int indice) {
        return combustivel.get(indice);
    }

    /**
     * @param combustivel the combustivel to set
     */
    private void setCombustivel(Item combustivel) {
        this.combustivel.add(combustivel);
    
    }
    
    
    
    /*
     * @param indice
     * @return the oleoMotor
     */
    public Item getOleoMotor(int indice) {
        return oleoMotor.get(indice);
    }

    /**
     * @param oleoMotor the oleoMotor to set
     */
    private void setOleoMotor(Item oleoMotor) {
        this.oleoMotor.add(oleoMotor);
    }
  
    
    
}
