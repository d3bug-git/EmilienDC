/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author hognoul
 */
public class LoginPanel extends JPanel {
   
    JPanel pseudoJPanel = new JPanel();
    JLabel pseudoJLabel = new JLabel("Pseudo :");
    JTextField pseudoJTextField = new JTextField();
    JPanel motDePasseJPanel = new JPanel();
    JLabel motDePasseJLabel = new JLabel("Mot de passe :");
    JPasswordField pseudoJPasswordField = new JPasswordField();
    JButton loginJButton = new JButton("Se Connecter");
    
    public LoginPanel(){
        initPanel();
    }
   
    private void initPanel(){
        initPseudo();
        initMotDePasse();
        this.add(loginJButton);
    }
     private void initPseudo(){
        this.pseudoJPanel.setPreferredSize(new Dimension(220, 60));
        this.pseudoJPanel.add(pseudoJLabel);
        this.pseudoJTextField.setPreferredSize(new Dimension(100, 25));
        this.pseudoJPanel.add(pseudoJTextField);
        this.add(pseudoJPanel);
    }
     private void initMotDePasse(){
        this.motDePasseJPanel.setPreferredSize(new Dimension(220, 60));
        this.motDePasseJPanel.add(motDePasseJLabel);
        this.pseudoJPasswordField.setPreferredSize(new Dimension(100, 25));
        this.motDePasseJPanel.add(pseudoJPasswordField);
        this.add(motDePasseJPanel);
    }
}
