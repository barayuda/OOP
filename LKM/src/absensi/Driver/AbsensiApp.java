/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package absensi.Driver;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Jayuk
 */
public class AbsensiApp extends Application
{
    public static String namaAdmin;

    @Override
    public void start(Stage primaryStage) throws Exception 
    {
        Parent parent = FXMLLoader.load(getClass().getResource("MainView.fxml"));
        Scene scene = new Scene(parent,800,600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    
}
