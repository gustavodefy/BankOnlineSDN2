/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mb.dao;

import br.com.mb.modelo.Conta;
import java.io.IOException;
import org.elasticsearch.client.Client;
import org.elasticsearch.common.xcontent.XContentBuilder;
import static org.elasticsearch.common.xcontent.XContentFactory.jsonBuilder;

/**
 *
 * @author ResVUT42
 */
public class Dao {

    Client client = ClientService.conectar();

    public void inserir(Conta conta) throws IOException {

        XContentBuilder jsonBuilder = jsonBuilder()
                .startObject()
                    .field("numeroConta", conta.getNConta())
                    .field("valor", conta.getValor())
                .endObject();
        
        client.prepareIndex("banco", "contacorrente")
                .setSource(jsonBuilder)
                .execute().actionGet();

    }

    public void alterar(Conta conta) throws IOException {

    }

    public Conta buscar(int nConta) throws IOException {
        Conta conta = new Conta();

        return conta;
    }

}
