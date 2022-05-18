/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttest6;

/**
 *
 * @author acer
 */
public class customer {
    private String nama,alamat,no_telp;
    protected static int jumlah = 0;
    
    public customer(String nama,String alamat,String no_telp){
    this.nama = nama;
    this.alamat = alamat;
    this.no_telp = no_telp;
    jumlah++;
    }
    public String getno_telp() {
        return no_telp;
    }

    public void setNim(String nim) {
        this.no_telp = no_telp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
        public void profile() {
        System.out.println("Nama          : " + this.nama);
        System.out.println("Alamat        : " + this.alamat);
        System.out.println("No Telepon          : " + this.no_telp);
    }
}
