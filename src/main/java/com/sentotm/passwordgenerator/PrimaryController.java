package com.sentotm.passwordgenerator;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;


public class PrimaryController {
    
    @FXML
    private Label passLabel;

    @FXML
    private void generarnuevopass() throws IOException {
        GeneradorContrasenya pass = new GeneradorContrasenya();
        String nuevoPass = pass.generarnuevopass();
        //cambiamos valor label
        passLabel.setText(nuevoPass + " se ha copiado al portapapeles.");
        
        //Vamos a hacer que se copie al Portapapeles directamente.
        final Clipboard clipboard = Clipboard.getSystemClipboard();
        final ClipboardContent content = new ClipboardContent();
        content.putString(nuevoPass);
        clipboard.setContent(content); 
    }
}
