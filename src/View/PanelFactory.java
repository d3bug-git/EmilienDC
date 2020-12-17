/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import controller.AppController;

/**
 *
 * @author hognoul
 */
public class PanelFactory {
    
    public static LoginPanel makeLoginPanel(AppController appController){
        return new LoginPanel(appController);
    }
    
    public static ManagerPanel makeManagerPanel(){
        return new ManagerPanel();
    }
}
