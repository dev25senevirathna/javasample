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
      my.details(4,2.5,3);
     my.lspeed();
      
    }
    
}
class sph{
   double fspeed;
    double accel;
     double time;
    double lspeed;
    
   public void details(double u, double a,double t){
        fspeed =u;
        accel =a;
       time =t;
        
     lspeed = u + 0.5*a*t ;
     
        
    }
   public void lspeed(){
       System.out.println(lspeed);
   }
    
}
