/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.royhanreza.latihanmvcjdbc.main;

import edu.royhanreza.latihanmvcjdbc.database.KingsBarbarShopDatabase;
import edu.royhanreza.latihanmvcjdbc.entity.Pelanggan;
import edu.royhanreza.latihanmvcjdbc.error.PelangganException;
import edu.royhanreza.latihanmvcjdbc.service.PelangganDao;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author RFR
 * NIM : 10116550
 * NAMA : ROYHAN FAISAL REZA
 * KELAS : PBO-12
 */
public class LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        
        PelangganDao dao = KingsBarbarShopDatabase.getPelangganDao();
        
        int total = 0;
        List<Pelanggan> list = dao.selectAllPelanggan();
        for (Pelanggan pelanggan : list){
            int cek = pelanggan.getId();
            
            total = total+cek;
            
        }
        System.out.println(total);
        
    }
    
}
