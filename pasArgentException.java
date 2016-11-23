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
public class pasArgentException extends Exception {
    
    public pasArgentException() {
        super(); 
    }
    public pasArgentException(String message) {
        super(message); 
    }
    public pasArgentException(String message, Throwable cause) {
        super(message, cause); 
    }
    public pasArgentException(Throwable cause) {
        super(cause); 
    }
    
}
