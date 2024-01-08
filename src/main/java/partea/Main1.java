/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package partea;

/**
 *
 * @author khalid
 */
public class Main1 {

    public static void main(String[] args) {
        
            Naipe naipeAl = new Naipe();
     
        do{
         naipeAl= new Naipe();
            System.out.println(naipeAl);
         
        }while(!(naipeAl.getNumCarta() == 10 && naipeAl.getPalo() == Palo.OROS));


    }
}
