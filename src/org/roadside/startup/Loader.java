/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.roadside.startup;
import javax.swing.*;
//import org.roadside.ui.RoadsideWindow;
import java.util.concurrent.*;

/**
 *
 * @author poloz@home
 */

public class Loader {
    
    static org.roadside.ui.RoadsideWindow mainWindow;
        
    public void StartMenu(){
        org.roadside.ui.RoadsideWindow.run(new org.roadside.ui.Button1(), 200, 100);
        
    }
            
}
