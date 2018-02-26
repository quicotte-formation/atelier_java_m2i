/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.exercice_ferme.view;

import atelierjava.exercice_ferme.service.JoueurService;
import javafx.beans.property.StringProperty;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

/**
 *
 * @author quico
 */
public class ConnexionPane extends GridPane {

    private Label lPseudo = new Label("Pseudo");
    private Label lMdp = new Label("Mot-de-passe");
    private TextField tfPseudo = new TextField();
    private PasswordField tfMdp = new PasswordField();
    private Button bConnexion = new Button("Connexion");

    public ConnexionPane() {
        super();
        this.add(lPseudo, 0, 0, 1, 1);
        this.add(tfPseudo, 1, 0, GridPane.REMAINING, 1);
        this.add(lMdp, 0, 1, 1, 1);
        this.add(tfMdp, 1, 1, GridPane.REMAINING, 1);
        this.add(bConnexion, 0, 2, GridPane.REMAINING, 1);
        
        bConnexion.setOnAction(e -> {
            
            // Connexion
            JoueurService service = new JoueurService();
            System.out.println( this.tfPseudo.getText() + "," + this.tfMdp.getText() );
            service.connexion(this.tfPseudo.getText(), this.tfMdp.getText());
        });
    }
}
