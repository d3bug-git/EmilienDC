/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emilliendc;

import controller.AppController;
import java.util.UUID;


/**
 *
 * @author Emilien
 */
public class AppRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AppController.getInstance().run();
        //generateUUID();
    }
    
    private static void generateUUID(){
        for(int i=0;i<3;i++){
            System.out.println("UUID-"+i+": "+UUID.randomUUID().toString());
        }
    }
    
}
