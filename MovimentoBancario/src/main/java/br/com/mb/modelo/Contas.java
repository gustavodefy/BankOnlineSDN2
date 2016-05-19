/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mb.modelo;

import java.sql.Date;

/**
 *
 * @author ResVUT42
 */
public class Contas {
    
    private int conta;
    private double saldo;
    private Date dtLcto;

    public Contas() {
        this.conta = 0;
        this.dtLcto = null;
        this.saldo = 0;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Date getDtLcto() {
        return dtLcto;
    }

    public void setDtLcto(Date dtLcto) {
        this.dtLcto = dtLcto;
    }
            
}
