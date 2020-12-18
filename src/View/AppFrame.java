/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import controller.AppController;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author hognoul
 */
public class AppFrame extends JFrame {

    private JPanel appPanel;
    private AppController appController;

    public AppFrame(AppController appController) {
        this.appController = appController;
        appPanel = PanelFactory.makeLoginPanel();
        this.setupFrame();
    }

    public JPanel getAppPanel() {
        return appPanel;
    }

    private void setupFrame() {
        this.setTitle("Emilien DC");
        this.setSize(400, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(appPanel);
        this.setVisible(true);
    }

    public void setAppPanel(JPanel appPanel) {
        this.appPanel = appPanel;
        this.setContentPane(this.appPanel);
        this.pack();
    }

}
