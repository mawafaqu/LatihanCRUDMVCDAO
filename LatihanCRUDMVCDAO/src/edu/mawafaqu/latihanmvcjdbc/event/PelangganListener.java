/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mawafaqu.latihanmvcjdbc.event;

import edu.mawafaqu.latihanmvcjdbc.entity.Pelanggan;
import edu.mawafaqu.latihanmvcjdbc.model.PelangganModel;
/**
 *
 * Nama  : Mawa Faqu Rochman
 * Nim   : 10117126
 * Kelas : IF-1
 */
public interface PelangganListener {
    public void onChange(PelangganModel model);

    public void onInsert(Pelanggan pelanggan);

    public void onDelete();

    public void onUpdate(Pelanggan pelanggan);
    
}
