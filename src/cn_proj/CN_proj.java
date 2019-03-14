/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn_proj;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Dell
 */
public class CN_proj extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
//        Circle cir = new Circle();
//        cir.setFill(Color.AQUAMARINE);
//        cir.setRadius(30);
//        cir.setLayoutX(50);
//        cir.setLayoutY(50);
//        
//        TranslateTransition trans= new TranslateTransition();
//        trans.setDuration(Duration.seconds(3));
//        trans.setToX(500);
//        trans.setToY(500);
//        trans.setAutoReverse(true);
//        trans.setCycleCount(3);
//        trans.setNode(cir);
//        trans.play();
        
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
//        root.getChildren().add(cir);
        
        
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.getIcons().add(new Image("file:logo.jpg"));
        stage.setTitle("GoBackN & Selective Repeat Simulator");
        stage.setResizable(false);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
