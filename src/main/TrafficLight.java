package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TrafficLight extends Application {
    Road road;
    Scene scene;
    @Override
    public void start(Stage primaryStage) throws Exception {

        road = new Road();
        scene = new Scene(road);

        primaryStage.setTitle("Traffic light!");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
    public static void main(String[] args) {
        launch(args);


    }

}
