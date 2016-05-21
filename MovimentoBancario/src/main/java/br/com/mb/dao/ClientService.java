/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mb.dao;

import java.net.InetAddress;
import java.net.UnknownHostException;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.common.transport.TransportAddress;

/**
 *
 * @author ResVUT42
 */
public class ClientService {

    public Client conectar() throws UnknownHostException, Exception {
        try {

            String nIp = "192.168.1.3";
            String cluster = "tamagu";

            Settings settings = Settings.settingsBuilder().put("cluster.name", cluster).build();
            TransportAddress tAddress = new InetSocketTransportAddress(InetAddress.getByName(nIp), 9300);

            Client client = TransportClient.builder().settings(settings).build().addTransportAddress(tAddress);

            return client;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
    }

}
