/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author hognoul
 */
public class RootFrame extends JFrame {

     private JPanel rootPanel = new JPanel();
    
    public RootFrame() {
        this.setTitle("Emilien DC");
        this.setSize(400, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(rootPanel);
        this.setVisible(true);
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public void setRootPanel(JPanel rootPanel) {
        this.rootPanel = rootPanel;
        this.setContentPane(this.rootPanel);
    }
    
    
}
