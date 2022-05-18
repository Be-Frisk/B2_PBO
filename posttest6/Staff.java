/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttest6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Staff implements admin {
    
    protected String username, password;
    private ArrayList<customer> dataCustomer;
    Scanner Input = new Scanner(System.in);
    String InputMenu;
    
    public Staff(String username, String password, ArrayList<customer> dataCustomer) {
        this.dataCustomer = dataCustomer;
           
    }   

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
    @Override
    public void lihatCustomer(){
        System.out.println("=== Data Seluruh customer ===\n");
        for (int i = 0; i < dataCustomer.size(); i++) {
                System.out.println("Customer ke - " + (i + 1));
                dataCustomer.get(i).profile();
            }
        
    }
    
    @Override
    public void tambahCustomer(){
        System.out.print("Masukkan nama customer : ");
        String nama = Input.next();
        System.out.print("Masukkan alamat customer : ");
        String alamat = Input.next();
        System.out.print("Masukkan no telepon customer : ");
        String no_telp = Input.next();
        dataCustomer.add(new customer(nama,alamat,no_telp));
    }
    
    @Override
    public void menu(){
        while (true) {
        System.out.println("--- Menu Manajemen Data Customer ---");
        System.out.println("1.Lihat Data Customer");
        System.out.println("2.Tambah Data Customer");
        System.out.println("3.Exit");
        
        InputMenu = Input.next();
        
        switch(InputMenu){
            case "1":
                this.lihatCustomer();
                break;
            case "2":
                this.tambahCustomer();
                break;
            case "3":
                return;
            default:
            System.out.println("Pilihan tidak ada");
            break;
        }
    }
}
}