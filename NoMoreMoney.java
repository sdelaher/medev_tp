/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medev_tp;

/**
 *
 * @author Ruizo
 */
public class NoMoreMoney extends Exception {
    
    public NoMoreMoney() {
        super(); 
    }
    public NoMoreMoney(String message) {
        super(message); 
    }
    public NoMoreMoney(String message, Throwable cause) {
        super(message, cause); 
    }
    public NoMoreMoney(Throwable cause) {
        super(cause); 
    }
    
}
