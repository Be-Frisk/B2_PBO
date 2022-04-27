/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttest4;

/**
 *
 * @author acer
 */
public class Piano extends AlatMusik {
    private int jumlahTuts;
    private String bahanTuts;
    
    public Piano(String jenis,String tipe,int harga,int jumlahTuts,String bahanTuts){
        super(jenis,tipe,harga);
        this.jumlahTuts = jumlahTuts;
        this.bahanTuts = bahanTuts;
    }    

    @Override
    public void tampilkanData(){
        super.tampilkanData();
        System.out.println("Bahan Tuts : " + this.bahanTuts);
        System.out.println("Jumlah Tuts : " + this.jumlahTuts + "\n");
    }
    
    public int getJumlahTuts() {
        return jumlahTuts;
    }

    public void setJumlahTuts(int jumlahTuts) {
        this.jumlahTuts = jumlahTuts;
    }

    public String getBahanTuts() {
        return bahanTuts;
    }

    public void setBahanTuts(String bahanTuts) {
        this.bahanTuts = bahanTuts;
    }

}  


