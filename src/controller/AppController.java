/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Entity.Personne;
import Entity.TypeUtilisateur;
import View.Connexion;
import View.PanelFactory;
import dao.Bdd;
import dao.DAOFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author hognoul
 */
public class AppController {

    private Connexion appFrame;
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

    public Connexion getAppFrame() {
        return this.appFrame;
    }

    public void run() {

        appFrame = new Connexion(this);
    }

    public void login(String pseudo, String password) {

        Personne user = (Personne) DAOFactory.getUserDAO().findByPseudo(pseudo);
        
        if (null == user) {
            JOptionPane.showMessageDialog(appFrame, "Utilisateur inexistant", "Alert", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (password.equals(user.getPassword())) {
            switch (user.getType()) {
                case TypeUtilisateur.CHEF_DE_PROJET:
                    appFrame.setAppPanel(PanelFactory.makeManagerPanel());
                    break;
                case TypeUtilisateur.EMPLOYE:
                    appFrame.setAppPanel(PanelFactory.makeEmployePanel());
                    break;
                case TypeUtilisateur.PATRON:
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
