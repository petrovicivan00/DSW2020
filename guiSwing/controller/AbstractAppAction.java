package app.guiSwing.controller;

import javax.swing.*;
import java.net.URL;

public abstract class AbstractAppAction extends AbstractAction {

    public Icon loadIcon(String fileName) {

        URL imageURL = getClass().getResource(fileName);
        Icon icon = null;

        if (imageURL != null) {
            icon = new ImageIcon(imageURL);
        } else {
            System.err.println("Icon not found: " + fileName);
        }
        return icon;
    }
}
