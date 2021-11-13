package main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class TrafficLightSync extends Application {
    Road road;
    Scene scene;
    Start start;
    Button addCarFromLeft, addCarFromRight, addCarFromBack, addCarFromFront;
    HBox view;
    VBox tools;
    @Override
    public void start(Stage primaryStage) throws Exception {

        road = new Road();


        tools = new VBox();
        addCarFromBack = new Button("Add car from back");
        addCarFromFront = new Button("Add car from Front");
        addCarFromLeft = new Button("Add car from left");
        addCarFromRight = new Button("Add car from right");
        tools.getChildren().addAll(addCarFromBack, addCarFromFront, addCarFromLeft, addCarFromRight);

        view = new HBox();
        view.getChildren().addAll(road, tools);

        tools.setSpacing(20);
//        tools.setPadding(new Insets(80,23,80,23));
        tools.setAlignment(Pos.CENTER);

        view.setSpacing(20);
        view.setPadding(new Insets(80,23,80,23));
        view.setAlignment(Pos.CENTER);

        scene = new Scene(view);
        primaryStage.setTitle("Traffic light!");
        primaryStage.setScene(scene);
        primaryStage.show();

        start = new Start(addCarFromBack, addCarFromFront, addCarFromLeft, addCarFromRight);
        start.start();


    }
    public static void main(String[] args) {
        launch(args);


    }

}
