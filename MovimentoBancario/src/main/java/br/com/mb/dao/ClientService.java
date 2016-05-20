/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mb.dao;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.common.transport.TransportAddress;


/**
 *
 * @author ResVUT42
 */
public class ClientService {
    
    public static Client conectar(){
        
        TransportAddress address = new InetSocketTransportAddress("localhost", 9300);
        
        Client client = new TransportClient().addTransportAddress(address);
    
        return client;
    }
    
    
    
}
