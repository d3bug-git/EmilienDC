/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emilliendc;

import controller.AppController;


/**
 *
 * @author hognoul
 */
public class AppRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Load Emillien DC");
        AppController appController = new AppController();
        appController.start();
        System.out.println("Start Emillien DC");
    }
    
}
