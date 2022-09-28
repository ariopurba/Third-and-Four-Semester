/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling;

/**
 *
 * @author Rafael Mahesa
 */
public class NegativeValueException extends Exception{
    public NegativeValueException(){
        
    }
    public NegativeValueException(String message){
        super(message);
    }
}
