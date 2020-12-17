/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import View.AppFrame;
import View.PanelFactory;
import dao.DbConnection;
import java.sql.Connection;


/**
 *
 * @author hognoul
 */
public class AppController {
    
    private AppFrame appFrame;
    private Connection bdd;
    private static AppController single;
    
    private AppController() {
     bdd = DbConnection.getInstance();
    }
    
    public static AppController getInstance(){
        if(single == null)
            single = new AppController();
        return single;
    }
    
    public AppFrame getAppFrame(){
        return this.appFrame; 
    }
    public void run(){
       
        appFrame = new AppFrame(this);
    }
    
    public void login(String pseudo, String password) {
        System.out.println("Pseudo: "+pseudo+" Password :"+password);
        appFrame.setAppPanel(PanelFactory.makeManagerPanel());
    }
    
}
