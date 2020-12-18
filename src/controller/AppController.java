/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Entity.User;
import Entity.UserType;
import View.AppFrame;
import View.PanelFactory;
import dao.Bdd;
import dao.DAOFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author hognoul
 */
public class AppController {

    private AppFrame appFrame;
    private static AppController single;

    private AppController() {
        Bdd.getInstance();
    }

    public static AppController getInstance() {
        if (single == null) {
            single = new AppController();
        }
        return single;
    }

    public AppFrame getAppFrame() {
        return this.appFrame;
    }

    public void run() {

        appFrame = new AppFrame(this);
    }

    public void login(String pseudo, String password) {

        User user = (User) DAOFactory.getUserDAO().findByPseudo(pseudo);
        
        if (null == user) {
            JOptionPane.showMessageDialog(appFrame, "Utilisateur inexistant", "Alert", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (password.equals(user.getPassword())) {
            switch (user.getType()) {
                case UserType.CHEF_DE_PROJET:
                    appFrame.setAppPanel(PanelFactory.makeManagerPanel());
                    break;
                case UserType.EMPLOYE:
                    appFrame.setAppPanel(PanelFactory.makeEmployePanel());
                    break;
                case UserType.PATRON:
                    appFrame.setAppPanel(PanelFactory.makeBossPanel());
                    break;
                default:
                    JOptionPane.showMessageDialog(appFrame, "Utilisateur n'est pas gérer dans cette version", "Alert", JOptionPane.WARNING_MESSAGE);
            }       
        }else{
            JOptionPane.showMessageDialog(appFrame, "Mot de passe incorrect", "Alert", JOptionPane.WARNING_MESSAGE);
        }
        
    }
}
