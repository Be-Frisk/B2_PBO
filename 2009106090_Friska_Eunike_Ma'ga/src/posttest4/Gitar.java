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
public class Gitar extends AlatMusik {
    private String jenisSenar;
    private int jumlahSenar;
    private String bahanNeck;
    
    public Gitar(String jenis,String tipe,int harga,String jenisSenar,int jumlahSenar,String bahanNeck){
        super(jenis,tipe,harga);
        this.jenisSenar = jenisSenar;
        this.bahanNeck = bahanNeck;
        this.jumlahSenar = jumlahSenar;
    }

    
    
    @Override
    public void tampilkanData(){
        super.tampilkanData();
        System.out.println("Jenis Senar : " + this.jenisSenar);
        System.out.println("Bahan Neck : " + this.bahanNeck);
        System.out.println("Jumlah Senar : " + this.jumlahSenar + "\n");
    }
    
    
    public String getJenisSenar() {
        return jenisSenar;
    }

    public void setJenisSenar(String jenisSenar) {
        this.jenisSenar = jenisSenar;
    }

    public int getJumlahSenar() {
        return jumlahSenar;
    }

    public void setJumlahSenar(int jumlahSenar) {
        this.jumlahSenar = jumlahSenar;
    }

    public String getBahanNeck() {
        return bahanNeck;
    }

    public void setBahanNeck(String bahanNeck) {
        this.bahanNeck = bahanNeck;
    }

    
}
