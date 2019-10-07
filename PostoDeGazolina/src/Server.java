/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tadeu
 */
import model.Item;
import model.Vendedor;
import gui.Comanda;
public class Server {
    Item gasComum = new Item();
    Item gasAditivada = new Item();
    Item oleoDisel = new Item();
    Item alcool = new Item();
    Item oleoMotor1 = new Item();
    Item oleoMotor500 = new Item();
    Vendedor posto = new Vendedor();
    posto.setCombustivel(oleoDisel);
    posto.setCombustivel(gasComum);
    posto.setCombustivel(gasAditivada);
    posto.setCombustivel(alcool);
    posto.setOleoMotor(oleoMotor500);
    posto.setOleoMotor(oleoMotor1);
}
