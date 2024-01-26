/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
// import java.util.logging.Level;
// import java.util.logging.Logger;
import ma.beans.Client;
import ma.connexion.Connexion;
import ma.dao.IDao;

/**
 *
 * @author Lachgar
 */
public class ClientService implements IDao<Client>{

    @Override
    public boolean create(Client o) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            String req = "insert into client values (null,'"+o.getNom()+"', '"+o.getPrenom()+"', '"+sdf.format(o.getDate())+"')";
            Statement st = Connexion.getConnection().createStatement();
            if(st.executeUpdate(req) == 1)
                return true;
        } catch (SQLException ex) {
            System.out.println("Erreur d'ajout d'un client:" +ex.getMessage());
        }
        return false;
    }

    @Override
    public boolean update(Client o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Client o) {
        String req = "delete from client where id = "+ o.getId();
        try {
            Statement st = Connexion.getConnection().createStatement();
            st.executeUpdate(req);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erreur de suppression d'un client:" +ex.getMessage());
        }
        return false;
    }

    @Override
    public Client findById(int id) {
        Client client = null;
        ResultSet rs = null;
        String req = "select * from client where id = "+id;
        try {
            Statement st = Connexion.getConnection().createStatement();
            rs = st.executeQuery(req);
            if (rs.next()){
              client = new Client(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"), rs.getDate("date"));
            }
        } catch (SQLException ex) {
            System.out.println("Erreur findById client:" +ex.getMessage());
        }
        return client;
    }

    @Override
    public List<Client> findAll() {
        List<Client> clients = new ArrayList<>();
        ResultSet rs = null;
        String req = "select * from client";
        try {
            Statement st = Connexion.getConnection().createStatement();
            rs = st.executeQuery(req);
            while (rs.next()){
              clients.add(new Client(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"), rs.getDate("date")));
            }
        } catch (SQLException ex) {
            System.out.println("Erreur findAll client:" +ex.getMessage());
        }
        return clients;
            
    }
    

    
}
