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
      my.details(4,2.5);
     my.force();
      
    }
    
}
class sph{
  
    double force;
    double mass;
    double accel;
    
    
   public void details(double f, double m,double a){
        force =f;
        mass =m;
       accel =a;
        
     force = m*a;
     
        
    }
   public void force(){
       System.out.println(force);
   }
    
}
