/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios.Modulo13.Conta.model.exceptions;

/**
 *
 * @author Gustavo
 */
public class BusinessException extends RuntimeException {
    
    public BusinessException(String msg) {
        super(msg);
    }
    
}
