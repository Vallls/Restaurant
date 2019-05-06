/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Gerente extends Thread{
   private Restaurant r;
    private Semaphore SEM;
    private Semaphore SA;
    private boolean trab = true;
    private int n;
    private JefeMesoneros jefe;
    private int Mesonr;

    public Gerente(Restaurant r, Semaphore SEM, Semaphore SA, int Mesonr) {
        this.r = r;
        this.SEM = SEM;
        this.SA = SA;
        this.Mesonr = Mesonr;
    }

    public Restaurant getR() {
        return r;
    }

    public void setR(Restaurant r) {
        this.r = r;
    }

    public Semaphore getSEM() {
        return SEM;
    }

    public void setSEM(Semaphore SEM) {
        this.SEM = SEM;
    }

    public Semaphore getSA() {
        return SA;
    }

    public void setSA(Semaphore SA) {
        this.SA = SA;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }


    public JefeMesoneros getJefe() {
        return jefe;
    }

    public void setJefe(JefeMesoneros jefe) {
        this.jefe = jefe;
    }

    public int getMesonr() {
        return Mesonr;
    }

    public void setMesonr(int Mesonr) {
        this.Mesonr = Mesonr;
    }

    public boolean isTrab() {
        return trab;
    }

    public void setTrab(boolean trab) {
        this.trab = trab;
    }
    
    
    //metodo heredado de la clase hilo para ejecutar funciones de este hilo
    @Override
    public void run(){
        while(trab){
            try {
                SEM.acquire(1);
                //seccion critica
                    if(this.r.getCont()==0){
                        this.sleep((long) (1000*0.1));
                        this.Cerrar();
                        this.r.setCont(this.r.getTiempo());
                        this.r.getGrafica().getCerradas().setText(Integer.toString(this.r.getCont()));
                        this.r.getGrafica().getOrdenes().setText(Integer.toString(this.r.getMesonr()));
                        System.out.println("soy el gerente");
                    }
                SEM.release(1);
                this.Dormir();
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    //metodo para hacer cerrar las ordenes
    public void Cerrar() throws InterruptedException{
        
        this.SA.acquire(1);
        this.r.setMesonr(0);
        this.r.getGrafica().getOrdenes().setText(Integer.toString(this.r.getMesonr()));
        this.SA.release();
        
            
    }
    
    //metodo para hacer dormir el gerente
     public void Dormir(){
        try {
            Random v = new Random();
            if(this.r.getCont()!=0){
                 this.n=25+(v.nextInt(20));
            }else{
             this.n=0;
            }
            this.r.getGrafica().getjLabel13().setText("Durmiendo");
            this.sleep(this.n*10);
            this.r.getGrafica().getjLabel13().setText("Despierto");
        } catch (InterruptedException ex) {
            Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
}
