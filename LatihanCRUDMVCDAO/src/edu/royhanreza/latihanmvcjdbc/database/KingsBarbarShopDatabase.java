/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.royhanreza.latihanmvcjdbc.database;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import edu.royhanreza.latihanmvcjdbc.impl.PelangganDaoImpl;
import java.sql.Connection;
import java.sql.SQLException;
import edu.royhanreza.latihanmvcjdbc.service.PelangganDao;
/**
 *
 * @author RFR
 * NIM : 10116550
 * NAMA : ROYHAN FAISAL REZA
 * KELAS : PBO-12
 */
public class KingsBarbarShopDatabase {
    
    private static Connection connection;
    private static PelangganDao pelangganDao;
    
    public static Connection getConnection() throws  SQLException{
        
        if(connection == null){
            
            MysqlDataSource ds = new MysqlDataSource();
            ds.setURL("jdbc:mysql://localhost:3306/kingsbarbarshop");
            ds.setUser("root");
            ds.setPassword("");
            connection = ds.getConnection();
        }
        
        return connection;
        
    }
    
    public static PelangganDao getPelangganDao() throws SQLException{
        
        if(pelangganDao == null){
            pelangganDao = new PelangganDaoImpl(getConnection());
        }
        
        return pelangganDao;
    }

    
    
}
