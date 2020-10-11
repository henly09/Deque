/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deque;

/**
 *
 * @author Henz Montera
 */
public class Deque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        listdeque<String> list = new listdeque<>();
        
        list.addfirst("waw2");
        list.addfirst("waw1");
        list.addlast("waw3");
        list.removefirst();
        System.out.print("First: " + list.first() + "\n" + "Last: " + list.last() +"\n"+ "Removed: "+ list.removed() +"\n" );
        list.removelast(); 
        System.out.print("First: " + list.first() + "\n" + "Last: " + list.last() +"\n"+ "Removed: "+ list.removed() +"\n" );
        
    }
    
}
