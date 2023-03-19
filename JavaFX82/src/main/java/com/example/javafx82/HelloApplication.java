package com.example.javafx82;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Image icon = new Image("https://i.pinimg.com/originals/96/e2/b6/96e2b6bc6bc57fd20a1e8d280d2995b2.jpg");
        stage.getIcons().add(icon);
        stage.setTitle("Мед книжка питомцев");
        stage.setResizable(false);
        //  #EDBD95 - основной       #F3CAA9 - цвет границ
        stage.setScene(scene);
        stage.show();

    }
    public static void main(String[] args) {

        launch();
    }


}