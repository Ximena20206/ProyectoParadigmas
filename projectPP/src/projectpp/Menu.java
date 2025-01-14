package projectpp;
import java.awt.*;//BorderLayout y CardLayout estan aqui
import java.util.List;
import java.util.Arrays;
public class Menu extends javax.swing.JFrame {

    
    
    public Menu() {
        
        
        initComponents();
       
        List<Equipo> equipos = Arrays.asList(
            new Equipo("Alavés"),
            new Equipo("Athletic"),
            new Equipo("Atletico De Madrid"),
            new Equipo("Barcelona"),
            new Equipo("Betis"),
            new Equipo("Celta de Vigo"),
            new Equipo("Getafe"),
            new Equipo("Girona"),
            new Equipo("Leganes"),
            new Equipo("Osasuna"),
            new Equipo("RCD Espanyol"),
            new Equipo("RCD Mallorca"),
            new Equipo("Rayo Vallecano"),
            new Equipo("Real Madrid"),
            new Equipo("Real Sociedad"),
            new Equipo("Sevilla"),
            new Equipo("UD Las Palmas"),
            new Equipo("Valencia"),
            new Equipo("Valladolid"),
            new Equipo("Villarreal")
        );
        
        MuestraEquipo.setLayout(new CardLayout());//hacemos el Cardlayout
        MuestraEquipo.add(new Alaves(equipos.get(0)), "Alavés");
        MuestraEquipo.add(new Athletic(equipos.get(1)), "Athletic");
        MuestraEquipo.add(new AtleticoDeMadrid(equipos.get(2)), "Athletic");
        MuestraEquipo.add(new Barcelona(equipos.get(3)), "Barcelona");
        MuestraEquipo.add(new Betis(equipos.get(4)), "Betis");
        MuestraEquipo.add(new CeltaDeVigo(equipos.get(5)), "Celta De Vigo");
        MuestraEquipo.add(new Getafe(equipos.get(6)), "Getafe");
        MuestraEquipo.add(new Girona(equipos.get(7)), "Girona");
        MuestraEquipo.add(new Leganes(equipos.get(8)), "Leganes");
        MuestraEquipo.add(new Osasuna(equipos.get(9)), "Osasuna");
        MuestraEquipo.add(new RCDEspanyol(equipos.get(10)), "RCD Espanyol");
        MuestraEquipo.add(new RCDMallorca(equipos.get(11)), "RCD Mallorca");
        MuestraEquipo.add(new RayoVallecano(equipos.get(12)), "Rayo Vallecano");
        MuestraEquipo.add(new RealMadrid(equipos.get(13)), "Real Madrid");
        MuestraEquipo.add(new RealSociedad(equipos.get(14)), "Real Sociedad");
        MuestraEquipo.add(new Sevilla(equipos.get(15)), "Sevilla");
        MuestraEquipo.add(new UDLasPalmas(equipos.get(16)), "UD Las Palmas");
        MuestraEquipo.add(new Valencia(equipos.get(17)), "Valencia");
        MuestraEquipo.add(new Valladolid(equipos.get(18)), "Valladolid");
        MuestraEquipo.add(new Villarreal(equipos.get(19)), "Villarreal");
       
      
        
        ((CardLayout) MuestraEquipo.getLayout()).show(MuestraEquipo, "Alaves");
        setLocationRelativeTo(null);
    }

        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        Regresar = new javax.swing.JButton();
        Siguiente = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        MuestraEquipo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Fondo.setBackground(new java.awt.Color(0, 0, 0));
        Fondo.setPreferredSize(new java.awt.Dimension(574, 500));

        Regresar.setBackground(new java.awt.Color(204, 204, 204));
        Regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuImages/nextsmall.png"))); // NOI18N
        Regresar.setContentAreaFilled(false);
        Regresar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuImages/nextsmall.png"))); // NOI18N
        Regresar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuImages/next.png"))); // NOI18N
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        Siguiente.setBackground(new java.awt.Color(204, 204, 204));
        Siguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuImages/previoussmall.png"))); // NOI18N
        Siguiente.setContentAreaFilled(false);
        Siguiente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuImages/previoussmall.png"))); // NOI18N
        Siguiente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuImages/previous.png"))); // NOI18N
        Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiguienteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Selecciona un equipo");

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addComponent(Siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                .addGap(0, 162, Short.MAX_VALUE)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(496, 496, 496))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(MuestraEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MuestraEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiguienteActionPerformed
        /*Villarreal p= new Villarreal();
        showPanel(p);*/
        CardLayout layout = (CardLayout) MuestraEquipo.getLayout();
        layout.previous(MuestraEquipo);
    }//GEN-LAST:event_SiguienteActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        /*Barcelona p1= new Barcelona();
        showPanel(p1);*/

        CardLayout layout = (CardLayout) MuestraEquipo.getLayout();
        layout.next(MuestraEquipo);
    }//GEN-LAST:event_RegresarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel MuestraEquipo;
    private javax.swing.JButton Regresar;
    private javax.swing.JButton Siguiente;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
