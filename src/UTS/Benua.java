/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

/**
 *
 * @author SMK TELKOM
 */
public class Benua {
    public void getbenua(String password){
        if (password=="nuzul"){
        System.out.println("---------------------------------");
        System.out.println("Password Yang Anda Masukkan Benar");
        System.out.println("---------------------------------");
        
        System.out.println("Benua Asia");
        System.out.println("Negara Indonesia");
        System.out.println("Indonesia beribukota Jakarta");
        System.out.println();
        
        System.out.println("Benua Afrika");
        System.out.println("Negara Mesir");
        System.out.println("Negara Mesir beribukota Kairo");
        System.out.println();
        
        System.out.println("Benua Australia");
        System.out.println("Negara Queensland");
        System.out.println("Negara Queensland beribukota Brisbane");
        System.out.println();
        
        System.out.println("Benua Eropa");
        System.out.println("Negara Belanda");
        System.out.println("Negara Belanda beribukota Amsterdam");
        System.out.println();
        }
            else{
        System.out.println("---------------------------------");
        System.out.println("Password Yang Anda Masukkan Salah");
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("Tidak ada dafatar benua satupun");
        }
    }
}
