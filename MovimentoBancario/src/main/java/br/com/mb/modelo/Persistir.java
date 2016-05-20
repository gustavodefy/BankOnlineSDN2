/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mb.modelo;

import br.com.mb.dao.Dao;
import java.io.IOException;

/**
 *
 * @author ResVUT42
 */
public class Persistir {

    private Conta conta;
    private Dao dao = new Dao();

    public void Depositar(Conta contaEntrada) throws Exception {
        try {

            this.conta = dao.buscar(conta.getNConta());

            //Se ainda não existe a conta
            if (this.conta == null) {
                dao.salvar(contaEntrada);
            } else {
                this.conta.somaValor(contaEntrada.getValor());
                dao.alterar(this.conta);
            }

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    public void Sacar(Conta contaEntrada) throws Exception {

        try {

            this.conta = dao.buscar(conta.getNConta());
                        
            if (this.conta != null) {
                this.conta.diminuiValor(contaEntrada.getValor());
                dao.alterar(this.conta);
            } else {
                //Se ainda não existe a conta
                throw new Exception("Conta não existe");
            }

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public Conta Consultar(int numeroConta) throws Exception{

        try {
            
            this.conta = dao.buscar(numeroConta);
            
            if (this.conta != null) {                
                return this.conta;
            } else {
                //Se ainda não existe a conta
                throw new Exception("Conta não existe");
            }            
            
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        
    }

}
