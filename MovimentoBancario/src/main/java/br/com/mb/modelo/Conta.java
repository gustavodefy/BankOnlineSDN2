/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mb.modelo;

/**
 *
 * @author ResVUT42
 */
public class Conta {
    
    private int nConta;
    private double valor;
   
    
    public Conta() {
        this.nConta = 0;
        this.valor = 0;
    }

    public int getNConta() {
        return nConta;
    }

    public void setNConta(int nConta) {
        this.nConta = nConta;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void somaValor(double valor){    
        this.valor = this.valor + valor;
    }
    
    public void diminuiValor(double valor){
        this.valor = this.valor - valor;
    }
            
}
