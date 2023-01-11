package com.materna.exercises.ownClasses;


import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.TimerTask;

public class FreeDiscSpaceTimerTask extends TimerTask {
    boolean icon = true;
    public void noSpaceLeft()   {
        if(icon)    {
            try {
                icon = false;
                String url = "https://cdn4.iconfinder.com/data/icons/common-toolbar/36/Save-16.png";
                ImageIcon icon = new ImageIcon( new URL( url ) );
                TrayIcon trayIcon = new TrayIcon( icon.getImage() );
                SystemTray.getSystemTray().add( trayIcon );
                trayIcon.displayMessage( "Achtung", "Platte voll", TrayIcon.MessageType.INFO );
            }
            catch ( Exception e ) { e.printStackTrace(); }
        }
    }
    @Override
    public void run() {
        long freeDiskSpace = java.io.File.listRoots()[0].getFreeSpace();
        if(freeDiskSpace<1000000000)    {
            System.out.println("Neue Festplatte kaufen!");
            noSpaceLeft();
        }
        else {
            System.out.println(freeDiskSpace);
        }
    }
}
