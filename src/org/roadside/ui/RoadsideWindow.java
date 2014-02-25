/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.roadside.ui;
import javax.swing.*;

/**
 *
 * @author poloz@home
 */
public class RoadsideWindow{
   public static void run(final JFrame f, final int width, final int height) {
       SwingUtilities.invokeLater(new Runnable() {
           public void run() {
               f.setTitle(f.getClass().getSimpleName());
               f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               f.setSize(width, height);
               f.setVisible(true);
            }
        });
    }
}