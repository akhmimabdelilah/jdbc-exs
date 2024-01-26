package ma.test;

import java.util.Date;
import ma.beans.Client;
import ma.service.ClientService;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lachgar
 */
public class Test {
    public static void main(String[] args) {
        ClientService cs = new ClientService();
        Client c = new Client("rami", "ali", new Date());
        //cs.create(c);
        
      //  System.out.println(cs.findById(2));
        cs.delete(cs.findById(2));
        for(Client cc : cs.findAll())
            System.out.println(cc);
    }
}
