/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import controller.AppController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

/**
 *
 * @author Emilien
 */
public class Identificatin extends javax.swing.JPanel {

    private AppController appController;

    /**
     * Creates new form NewJPanel
     */
    public Identificatin(AppController appController) {
        
        this.appController = appController;
        initComponents();
        this.setupListeners();
    }

    
    private void setupListeners(){
        loginButton.addActionListener((ActionEvent e) -> {
            this.appController.login(pseudoTextField.getText(), String.valueOf(passwordTextField.getPassword()));
        });
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelPseudo = new javax.swing.JLabel();
        pseudoTextField = new javax.swing.JTextField();
        labelPassword = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();

        labelPseudo.setText("Pseudo :");

        labelPassword.setText("Mot de Passe :");

        loginButton.setText("login");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelPseudo)
                            .addComponent(labelPassword))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pseudoTextField)
                            .addComponent(passwordTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)))
                    .addComponent(loginButton))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPseudo)
                    .addComponent(pseudoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPassword))
                .addGap(27, 27, 27)
                .addComponent(loginButton)
                .addContainerGap(82, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelPseudo;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JTextField pseudoTextField;
    // End of variables declaration//GEN-END:variables
}
