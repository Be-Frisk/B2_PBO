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
import java.io.IOException;

public interface admin {

    void menu() throws IOException;
    
    void lihatCustomer() throws IOException;

    void tambahCustomer() throws IOException;
    
}
