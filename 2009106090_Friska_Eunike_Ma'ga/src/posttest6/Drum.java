/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttest6;

import posttest5.*;
import posttest4.*;

/**
 *
 * @author acer
 */
public final class Drum extends AlatMusik {
    private final String jenis = "Drum";
    private String bahan;
    private int jumlahKit;
    
    public Drum(String tipe,int harga,String bahan,int jumlahKit){
        super(tipe,harga);
        this.bahan = bahan;
        this.jumlahKit = jumlahKit;
    }    

    @Override
    public void tampilkanData(){
//        super.tampilkanData();
        System.out.println("Bahan : " + this.bahan);
        System.out.println("Jumlah Kit : " + this.jumlahKit +"\n");
    }    
    
    public final void display(){
       System.out.println("Jenis : " + this.jenis);
    }

    public String getJenis() {
        return jenis;
    }
    
    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public int getJumlahKit() {
        return jumlahKit;
    }

    public void setJumlahKit(int jumlahKit) {
        this.jumlahKit = jumlahKit;
    }
    
}
