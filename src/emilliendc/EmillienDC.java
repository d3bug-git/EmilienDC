/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emilliendc;

import View.*;


/**
 *
 * @author hognoul
 */
public class EmillienDC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LoginPanel loginPanel = new LoginPanel();
        ProjectManagerPanel projectManagerPanel = new ProjectManagerPanel();
        RootFrame rootFrame = new RootFrame();
        rootFrame.setRootPanel(loginPanel);
    }
    
}
