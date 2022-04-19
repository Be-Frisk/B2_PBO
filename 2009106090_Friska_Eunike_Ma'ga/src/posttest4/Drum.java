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
public class Drum extends AlatMusik {
    private String bahan;
    private int jumlahKit;
    
    public Drum(String jenis,String tipe,int harga,String bahan,int jumlahKit){
        super(jenis,tipe,harga);
        this.bahan = bahan;
        this.jumlahKit = jumlahKit;
    }    

    @Override
    public void tampilkanData(){
        super.tampilkanData();
        System.out.println("Bahan : " + this.bahan);
        System.out.println("Jumlah Kit : " + this.jumlahKit +"\n");
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
