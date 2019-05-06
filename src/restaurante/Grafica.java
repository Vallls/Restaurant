/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import javax.accessibility.AccessibleContext;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


//clase para el display del sistema
public class Grafica extends javax.swing.JFrame {
Restaurant r;
     int cont=0;

    public JLabel getCantidadE() {
        return CantidadE;
    }

    public void setCantidadE(JLabel CantidadE) {
        this.CantidadE = CantidadE;
    }

    public JLabel getCantidadF() {
        return CantidadF;
    }

    public void setCantidadF(JLabel CantidadF) {
        this.CantidadF = CantidadF;
    }

    public JLabel getCantidadM() {
        return CantidadM;
    }

    public void setCantidadM(JLabel CantidadM) {
        this.CantidadM = CantidadM;
    }

    public JLabel getCantidadP() {
        return CantidadP;
    }

    public void setCantidadP(JLabel CantidadP) {
        this.CantidadP = CantidadP;
    }

    public JLabel getCerradas() {
        return Cerradas;
    }

    public void setCerradas(JLabel Cerradas) {
        this.Cerradas = Cerradas;
    }

    public JLabel getEntradas() {
        return Entradas;
    }

    public void setEntradas(JLabel Entradas) {
        this.Entradas = Entradas;
    }

    public JLabel getFuertes() {
        return Fuertes;
    }

    public void setFuertes(JLabel Fuertes) {
        this.Fuertes = Fuertes;
    }

    public JLabel getOrdenes() {
        return Ordenes;
    }

    public void setOrdenes(JLabel Ordenes) {
        this.Ordenes = Ordenes;
    }

    public JLabel getPostres() {
        return Postres;
    }

    public void setPostres(JLabel Postres) {
        this.Postres = Postres;
    }

    public JLabel getjLabel13() {
        return jLabel13;
    }

    public void setjLabel13(JLabel jLabel13) {
        this.jLabel13 = jLabel13;
    }

    public JLabel getjLabel14() {
        return jLabel14;
    }

    public void setjLabel14(JLabel jLabel14) {
        this.jLabel14 = jLabel14;
    }
    /**
     * Creates new form Grafica
     */
     
     
     
     public AccessibleContext getAccessibleContext() {
        return accessibleContext;
    }

    public void setAccessibleContext(AccessibleContext accessibleContext) {
        this.accessibleContext = accessibleContext;
    }
    
    public Grafica(Restaurant r) {
        initComponents();
        this.r=r;
    }

    public Restaurant getR() {
        return r;
    }

    public void setR(Restaurant r) {
        this.r = r;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    

    public JButton getjButton1() {
        return jButton1;
    }

    public void setjButton1(JButton jButton1) {
        this.jButton1 = jButton1;
    }

    public JButton getjButton2() {
        return jButton2;
    }

    public void setjButton2(JButton jButton2) {
        this.jButton2 = jButton2;
    }

    public JButton getjButton3() {
        return jButton3;
    }

    public void setjButton3(JButton jButton3) {
        this.jButton3 = jButton3;
    }

    public JButton getjButton4() {
        return jButton4;
    }

    public void setjButton4(JButton jButton4) {
        this.jButton4 = jButton4;
    }

    public JButton getjButton5() {
        return jButton5;
    }

    public void setjButton5(JButton jButton5) {
        this.jButton5 = jButton5;
    }

    public JButton getjButton6() {
        return jButton6;
    }

    public void setjButton6(JButton jButton6) {
        this.jButton6 = jButton6;
    }

    public JButton getjButton7() {
        return jButton7;
    }

    public void setjButton7(JButton jButton7) {
        this.jButton7 = jButton7;
    }

    public JButton getjButton8() {
        return jButton8;
    }

    public void setjButton8(JButton jButton8) {
        this.jButton8 = jButton8;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel10() {
        return jLabel10;
    }

    public void setjLabel10(JLabel jLabel10) {
        this.jLabel10 = jLabel10;
    }

    public JLabel getjLabel11() {
        return jLabel11;
    }

    public void setjLabel11(JLabel jLabel11) {
        this.jLabel11 = jLabel11;
    }

    public JLabel getjLabel12() {
        return jLabel12;
    }

    public void setjLabel12(JLabel jLabel12) {
        this.jLabel12 = jLabel12;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public void setjLabel7(JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    public JLabel getjLabel8() {
        return jLabel8;
    }

    public void setjLabel8(JLabel jLabel8) {
        this.jLabel8 = jLabel8;
    }

    public JLabel getjLabel9() {
        return jLabel9;
    }

    public void setjLabel9(JLabel jLabel9) {
        this.jLabel9 = jLabel9;
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(200, 0), new java.awt.Dimension(200, 0), new java.awt.Dimension(200, 32767));
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        CantidadE = new javax.swing.JLabel();
        CantidadF = new javax.swing.JLabel();
        CantidadP = new javax.swing.JLabel();
        CantidadM = new javax.swing.JLabel();
        Entradas = new javax.swing.JLabel();
        Fuertes = new javax.swing.JLabel();
        Postres = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Cerradas = new javax.swing.JLabel();
        Ordenes = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 32767));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(200, 0), new java.awt.Dimension(200, 0), new java.awt.Dimension(200, 32767));
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(200, 0), new java.awt.Dimension(200, 0), new java.awt.Dimension(200, 32767));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 32)); // NOI18N
        jLabel1.setText("Restaurant Heredia-Madio-Kalen");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 13, -1, -1));

        jLabel2.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel2.setText("Cocineros Entradas");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 109, -1, -1));

        jLabel3.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel3.setText("Cocineros Platos Fuertes");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 109, -1, -1));

        jLabel4.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel4.setText("Cocineros Postres");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 109, -1, -1));

        jLabel10.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel10.setText("Entradas:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel5.setText("Mesoneros");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(792, 109, -1, -1));

        jLabel11.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel11.setText("Platos Fuertes:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 299, -1, -1));

        jLabel6.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel6.setText("Gerente:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 280, -1, -1));

        jLabel12.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel12.setText("Postres:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 334, -1, -1));

        jLabel7.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel7.setText("Jefe de Mesoneros:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 315, -1, -1));

        jLabel8.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel8.setText("Tiempo para finalizar la jornada:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 315, -1, -1));

        jLabel9.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel9.setText("Ordenes Atendidas:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 280, -1, -1));

        jButton1.setForeground(new java.awt.Color(0, 204, 51));
        jButton1.setText("Contratar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 172, -1, -1));

        jButton2.setForeground(new java.awt.Color(255, 51, 51));
        jButton2.setText("Despedir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 172, -1, -1));

        jButton3.setForeground(new java.awt.Color(0, 204, 102));
        jButton3.setText("Contratar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 172, -1, -1));

        jButton4.setForeground(new java.awt.Color(255, 51, 51));
        jButton4.setText("Despedir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 172, -1, -1));

        jButton5.setForeground(new java.awt.Color(0, 204, 102));
        jButton5.setText("Contratar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 172, -1, -1));

        jButton6.setForeground(new java.awt.Color(255, 51, 51));
        jButton6.setText("Despedir");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(589, 172, -1, -1));

        jButton7.setForeground(new java.awt.Color(0, 204, 102));
        jButton7.setText("Contratar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(758, 172, -1, -1));

        jButton8.setForeground(new java.awt.Color(255, 51, 51));
        jButton8.setText("Despedir");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(852, 172, -1, -1));

        CantidadE.setText("0");
        getContentPane().add(CantidadE, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 138, -1, -1));

        CantidadF.setText("0");
        getContentPane().add(CantidadF, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 138, -1, -1));

        CantidadP.setText("0");
        getContentPane().add(CantidadP, new org.netbeans.lib.awtextra.AbsoluteConstraints(596, 138, -1, -1));

        CantidadM.setText("0");
        getContentPane().add(CantidadM, new org.netbeans.lib.awtextra.AbsoluteConstraints(822, 138, -1, -1));

        Entradas.setText("0");
        getContentPane().add(Entradas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 259, -1, -1));

        Fuertes.setText("0");
        getContentPane().add(Fuertes, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 298, -1, -1));

        Postres.setText("0");
        getContentPane().add(Postres, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 333, -1, -1));

        jLabel13.setText("jLabel13");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 279, -1, -1));

        jLabel14.setText("jLabel14");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 314, -1, -1));

        Cerradas.setText("0");
        getContentPane().add(Cerradas, new org.netbeans.lib.awtextra.AbsoluteConstraints(754, 314, -1, -1));

        Ordenes.setText("0");
        getContentPane().add(Ordenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(754, 279, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 233, 798, 5));
        getContentPane().add(filler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(885, 233, -1, -1));
        getContentPane().add(filler3, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 252, -1, -1));
        getContentPane().add(filler4, new org.netbeans.lib.awtextra.AbsoluteConstraints(728, 245, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean contratar=false;
        for (int i = 0; i <this.r.getInicialE(); i++) {

            if(this.r.getCocineroE()[i]==null && !contratar){
                this.r.getCocineroE()[i]=new Cocinero(this.r.getSPE(),this.r.getSPEE(),this.r.getSCE(),this.r.getMesonE(),this.r.getProduccionE(),1,this.r, (float) 0.25);
                this.r.getCocineroE()[i].start();
                contratar=true;
                System.out.println(this.r.getCocineroE()[i]);
                break;

            }
        }
        if(this.r.getInicialE()<this.r.getMaxCE()){
            this.r.setInicialE(this.r.getInicialE()+1);
            this.r.getGrafica().getCantidadE().setText(Integer.toString(this.r.getInicialE()));
        }

        System.out.println(this.r.getInicialE());        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        for (int i =0; i <this.r.getCocineroE().length; i++) {
            boolean despedir=false;
            if(this.r.getCocineroE()[i]!=null && despedir==false){
                this.r.getCocineroE()[i].setEjecutar(false);
                this.r.getCocineroE()[i]=null;
                System.out.println(this.r.getCocineroE()[i]);
                despedir=true;
                break;

            }

        }
        if(this.r.getInicialE()>0){
            this.r.setInicialE(this.r.getInicialE()-1);
            this.r.getGrafica().getCantidadE().setText(Integer.toString(this.r.getInicialE()));
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        boolean contratar=false;
        for (int i = 0; i <this.r.getInicialF(); i++) {

            if(this.r.getCocineroF()[i]==null && !contratar){
                this.r.getCocineroF()[i]=new Cocinero(this.r.getSPF(),this.r.getSPEF(),this.r.getSCF(),this.r.getMesonF(),this.r.getProduccionF(),2,this.r, (float) 0.33);
                this.r.getCocineroF()[i].start();
                contratar=true;
                System.out.println(this.r.getCocineroF()[i]);
                break;

            }
        }
        if(this.r.getInicialF()<this.r.getMaxCF()){
            this.r.setInicialF(this.r.getInicialF()+1);
            this.r.getGrafica().getCantidadF().setText(Integer.toString(this.r.getInicialF()));
        }

        System.out.println(this.r.getInicialF());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        for (int i =0; i <this.r.getCocineroF().length; i++) {
            boolean despedir=false;
            if(this.r.getCocineroF()[i]!=null && despedir==false){
                this.r.getCocineroF()[i].setEjecutar(false);
                this.r.getCocineroF()[i]=null;
                System.out.println(this.r.getCocineroF()[i]);
                despedir=true;
                break;

            }

        }
        if(this.r.getInicialF()>0){
            this.r.setInicialF(this.r.getInicialF()-1);
            this.r.getGrafica().getCantidadF().setText(Integer.toString(this.r.getInicialF()));
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        boolean contratar=false;
         if(this.r.getInicialP()<this.r.getMaxCP()){
            this.r.setInicialP(this.r.getInicialP()+1);
            this.r.getGrafica().getCantidadP().setText(Integer.toString(this.r.getInicialP()));
        }
         
        for (int i = 0; i <this.r.getInicialP(); i++) {

            if(this.r.getCocineroP()[i]==null && !contratar){
                this.r.getCocineroP()[i]=new Cocinero(this.r.getSPP(),this.r.getSPEP(),this.r.getSCP(),this.r.getMesonP(),this.r.getProduccionP(),3,this.r, (float) 0.30);
                this.r.getCocineroP()[i].start();
                contratar=true;
                System.out.println(this.r.getCocineroP()[i]);
                break;

            }
        }
       

        System.out.println(this.r.getInicialP());        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        for (int i =0; i <this.r.getCocineroP().length; i++) {
            boolean despedir=false;
            if(this.r.getCocineroP()[i]!=null && despedir==false){
                this.r.getCocineroP()[i].setEjecutar(false);
                this.r.getCocineroP()[i]=null;
                System.out.println(this.r.getCocineroP()[i]);
                despedir=true;
                break;

            }

        }
        if(this.r.getInicialP()>0){
            this.r.setInicialP(this.r.getInicialP()-1);
            this.r.getGrafica().getCantidadP().setText(Integer.toString(this.r.getInicialP()));
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         boolean contratar = false;
        
        if(this.r.getInicialM() < this.r.getMaxM()){
            this.r.setInicialM(this.r.getInicialM()+1);
            this.r.getGrafica().getCantidadM().setText(Integer.toString(this.r.getInicialM()));
        } 
         
        for(int i=0; i<this.r.getInicialM(); i++){
            if(this.r.getMesonero()[i] == null && !contratar){
                this.r.getMesonero()[i] = new Mesonero(this.r.getSCE(),this.r.getSPEE(),this.r.getSPE(),this.r.getSCF(),this.r.getSPEF(),this.r.getSPF(),this.r.getSCP(),this.r.getSPEP(),this.r.getSPP(), (float) 0.15,this.r.getConsumirE(),this.r.getConsumirF(),this.r.getConsumirP(),this.r,0,this.r.getSA());
                this.r.getMesonero()[i].start();
                contratar=true;
                System.out.println(this.r.getMesonero()[i]);
                break;
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       for(int i=0; i<this.r.getMesonero().length; i++){
            boolean despedir = false;
            if(this.r.getMesonero()[i]!=null && despedir==false){
                this.r.getMesonero()[i].setEjecutar(false);
                this.r.getMesonero()[i]=null;
                System.out.println(this.r.getMesonero()[i]);
                despedir=true;
                break; 
            }  
        }
        if(this.r.getInicialM() > 0){
        this.r.setInicialM(this.r.getInicialM()-1);
        this.r.getGrafica().getCantidadM().setText(Integer.toString(this.r.getInicialM()));
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    /**
     * @param args the command line arguments
     */
    //public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        //</editor-fold>

        /* Create and display the form */
       // java.awt.EventQueue.invokeLater(new Runnable() {
      //      public void run() {
      //          new Grafica(r).setVisible(true);
            //}
      //  });
  //  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CantidadE;
    private javax.swing.JLabel CantidadF;
    private javax.swing.JLabel CantidadM;
    private javax.swing.JLabel CantidadP;
    private javax.swing.JLabel Cerradas;
    private javax.swing.JLabel Entradas;
    private javax.swing.JLabel Fuertes;
    private javax.swing.JLabel Ordenes;
    private javax.swing.JLabel Postres;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
