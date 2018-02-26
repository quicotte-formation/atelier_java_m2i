/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.exercice_ferme.view;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author quico
 */
public class NewFXMain extends Application {

    private ImageView ivBle = new ImageView("file:C:\\Users\\quico\\Documents\\NetBeansProjects\\atelier_java_m2i\\src\\ble.png");
    private ImageView ivCabri = new ImageView("file:C:\\Users\\quico\\Documents\\NetBeansProjects\\atelier_java_m2i\\src\\cabri.png");
    private ImageView ivCarotte = new ImageView("file:C:\\Users\\quico\\Documents\\NetBeansProjects\\atelier_java_m2i\\src\\carotte.png");
    private ImageView ivFermiere = new ImageView("file:C:\\Users\\quico\\Documents\\NetBeansProjects\\atelier_java_m2i\\src\\fermiere.png");

    @Override
    public void start(Stage primaryStage) {

        // Applique même taille à chaque image
        List<ImageView> imageViews = new ArrayList<>();
        imageViews.add(ivBle);
        imageViews.add(ivCabri);
        imageViews.add(ivCarotte);
        imageViews.add(ivFermiere);
        for (ImageView iv : imageViews) {

            iv.setFitHeight(50);
            iv.setFitWidth(50);
        }
        BorderPane root = new BorderPane();
        HBox hBoxCentre = new HBox(ivBle, ivCabri, ivCarotte, ivFermiere);
        root.setCenter(new ConnexionPane());
//        root.setCenter(hBoxCentre);
        hBoxCentre.alignmentProperty().setValue(Pos.CENTER);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Gaia");
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
