/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gim;

/**
 *
 * @author Chathani
 */
public class Gim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      sph my= new sph();
      my.details(4,2.4,3.1);
     my.vol();
      
    }
    
}
class sph{
   double length;
    double width;
     double height;
    double vol;
    
   public void details(double l, double w,double h){
        length =l;
        width =w;
       height =h;
        
     vol =l*w*h;
     
        
    }
   public void vol(){
       System.out.println(vol);
   }
    
}
