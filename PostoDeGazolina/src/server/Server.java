/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

/**
 *
 * @author Tadeu
 */

import gui.Comanda;
import model.Item;
import model.Vendedor;

public class Server {
  
    public static Vendedor posto = new Vendedor();
    
//    public Server(){

//    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
            Vendedor posto = new Vendedor();
            Comanda comanda = new Comanda(posto);
            comanda.setVisible(true);
        };
        
        
    }
    

