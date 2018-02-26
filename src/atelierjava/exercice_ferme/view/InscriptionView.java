/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.exercice_ferme.view;

import atelierjava.exercice_ferme.service.JoueurService;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 *
 * @author Formation
 */
public class InscriptionView extends GridPane {

    private Label lPseudo = new Label("Pseudo");
    private TextField tfPseudo = new TextField();
    private Label lMdp = new Label("Mot-de-passe");
    private PasswordField pfMdp = new PasswordField();
    private Button bInscription = new Button("Inscription");

    public InscriptionView() {

        // Place des comosants dans ma vue
        this.add(lPseudo, 0, 0);
        this.add(tfPseudo, 1, 0);
        this.add(lMdp, 0, 1);
        this.add(pfMdp, 1, 1);
        this.add(bInscription, 1, 2);

        // Définir mon controleur sur clic bouton
        bInscription.setOnAction(e -> {
            try {
                // Récup pseudo et mdp entrés par l'utilisateur
                String pseudoEntre = tfPseudo.getText();
                String mdpEntre = pfMdp.getText();

                // Appelle service d'inscription
                JoueurService service = new JoueurService();
                service.inscription(pseudoEntre, mdpEntre);
            } catch (Exception exception) {
                
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Erreur");
                alert.setHeaderText("Il s'est produit une erreur");
                alert.setContentText( exception.getMessage() );
                
                alert.showAndWait();
            }
        });
    }
}
