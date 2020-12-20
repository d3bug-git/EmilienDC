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
    
    protected static final AppController appController = AppController.getInstance(); 
    
    public static Identificatin makeLoginPanel(){
        return new Identificatin(appController);
    }
    
    public static ChefEquipe makeManagerPanel(){
        return new ChefEquipe(appController);
    }
    public static Patron makeBossPanel(){
        return new Patron(appController);
    }
    public static Employé makeEmployePanel(){
        return new Employé(appController);
    }
}
