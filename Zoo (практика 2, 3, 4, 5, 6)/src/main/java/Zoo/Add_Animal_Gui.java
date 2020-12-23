/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoo;

import javax.swing.JFrame;
import static Zoo.Zoo_Builder.cell;

/**
 *
 * @author Dragonsnom
 */
public class Add_Animal_Gui extends javax.swing.JFrame {
    
    static Add_Animal_Gui add = new Add_Animal_Gui() {};
    
    
    static void run()
    {
        add.setVisible(true);
        add.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }

    /**
     * Creates new form Add_Animal_Gui
     */
    public Add_Animal_Gui() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        /**
         * @param args the command line arguments
         */
        // Variables declaration - do not modify//GEN-BEGIN:variables
        javax.swing.JButton jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JToggleButton jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Добавить животное");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jLabel1.setText("Введите номер клетки");

        jToggleButton1.setText("Убрать животное");
        jToggleButton1.addActionListener(this::jToggleButton1ActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToggleButton1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if (cell.size() >= Integer.parseInt(jTextField1.getText()) - 1 || Integer.parseInt(jTextField1.getText()) - 1 < 1) {
            
        Animal_Gui.run();
        Animal_Gui.x = Integer.parseInt(jTextField1.getText());
        jTextField1.setText("");

        }
        else
        {
          Zoo_Gui.jTextArea2.append("нет такой клетки\n");
        }
        add.setVisible(false);


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
       if (cell.size() >= Integer.parseInt(jTextField1.getText()) - 1 || Integer.parseInt(jTextField1.getText()) - 1 < 1)
       {
        
        int x = Integer.parseInt(jTextField1.getText());
        Zoo_Metods.AnimalRemove(x);
        jTextField1.setText("");
       }
       else{
           Zoo_Gui.jTextArea2.append("нет такой клетки\n");

       }
        add.setVisible(false);

    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
