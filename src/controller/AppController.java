/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import View.AppFrame;
import View.PanelFactory;


/**
 *
 * @author hognoul
 */
public class AppController {
    
    private AppFrame appFrame;

    public AppController() {
     
    }
    public AppFrame getAppFrame(){
        return this.appFrame; 
    }
    public void start(){
        appFrame = new AppFrame(this);
    }

    public void login(String pseudo, String password) {
        System.out.println("Pseudo: "+pseudo+" Password :"+password);
        appFrame.setAppPanel(PanelFactory.makeManagerPanel());
    }
    
}
