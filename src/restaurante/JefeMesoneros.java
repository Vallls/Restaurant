/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;


public class JefeMesoneros extends Thread{
    Restaurant r;
    Grafica g;
    private final Semaphore SEM;


    public JefeMesoneros(Restaurant r,  Semaphore SEM) {
        this.r = r;
        this.g = g;
        this.SEM = SEM;
    }
    
 //metodo heredado de la clase hilo para ejecutar funciones de este hilo
  public void run(){
      while(true){
          try {
             this.r.getGrafica().getjLabel14().setText("Durmiendo");
             this.sleep(1000);
             this.r.getGrafica().getjLabel14().setText("Despierto");
             
              
              SEM.acquire();
               this.sleep((long) (0.05*1000));
               this.Contar();
              SEM.release();
              
          } catch (InterruptedException ex) {
              Logger.getLogger(JefeMesoneros.class.getName()).log(Level.SEVERE, null, ex);
          }
      
      }
  }
  
  public void Contar(){
     
      if(this.r.getCont()!=0 && this.r.getCont()>0){
          this.r.setCont(this.r.getCont()-1);
          this.r.getGrafica().getCerradas().setText(Integer.toString(this.r.getCont()));
      }

  } 
}
