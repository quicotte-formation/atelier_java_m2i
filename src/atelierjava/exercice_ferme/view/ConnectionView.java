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
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

/**
 *
 * @author Formation
 */
public class ConnectionView extends GridPane {

    private Label lPseudo = new Label("Pseudo");
    private TextField tfPseudo = new TextField();
    private Label lMdp = new Label("Mot-de-passe");
    private PasswordField pfMdp = new PasswordField();
    private Button bConnexion = new Button("Connexion");

    public ConnectionView(BorderPane borderPaneDuParent) {

        // Place des comosants dans ma vue
        this.add(lPseudo, 0, 0);
        this.add(tfPseudo, 1, 0);
        this.add(lMdp, 0, 1);
        this.add(pfMdp, 1, 1);
        this.add(bConnexion, 1, 2);

        // Définir mon controleur sur clic bouton
        bConnexion.setOnAction(e -> {
            try {
                // Récup login et mdp
                String pseudo = tfPseudo.getText();
                String mdp = pfMdp.getText();

                //  Connecte en utilisant JoueurService.connexion
                JoueurService service = new JoueurService();
                service.connexion(pseudo, mdp);

                // Affiche l'écran de jeu
                borderPaneDuParent.setCenter( new EcranJeuView() );
            } catch (Exception erreur) {

                Alert alert = new Alert(Alert.AlertType.ERROR);
                
                alert.setTitle("Erreur");
                alert.setHeaderText("Il s'est produit une erreur");
                alert.setContentText( erreur.getMessage() );
                
                erreur.printStackTrace();
                
                alert.showAndWait();
            }
        });
    }

}
