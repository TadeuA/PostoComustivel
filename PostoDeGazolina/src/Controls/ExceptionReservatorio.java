package Controls;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author mpisching
 */
public class ExceptionReservatorio extends Exception {

    /**
     * Creates a new instance of <code>ExceptionReservatorio</code> without
     * detail message.
     */
    public ExceptionReservatorio() {
    }

    /**
     * Constructs an instance of <code>ExceptionReservatorio</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ExceptionReservatorio(String msg) {
        super(msg);
    }
}
