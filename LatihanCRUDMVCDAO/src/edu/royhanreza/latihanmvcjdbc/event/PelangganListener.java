/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.royhanreza.latihanmvcjdbc.event;

import edu.royhanreza.latihanmvcjdbc.entity.Pelanggan;
import edu.royhanreza.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author RFR
 * NIM : 10116550
 * NAMA : ROYHAN FAISAL REZA
 * KELAS : PBO-12
 */
public interface PelangganListener {

    public void onChange(PelangganModel model);

    public void onInsert(Pelanggan pelanggan);

    public void onDelete();

    public void onUpdate(Pelanggan pelanggan);

    

}
