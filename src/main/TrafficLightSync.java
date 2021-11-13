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
        addCarFromBack.setId(C.ADD_CAR_FROM_BACK_BUTTON_ID);

        addCarFromFront = new Button("Add car from Front");
        addCarFromFront.setId(C.ADD_CAR_FROM_FRONT_BUTTON_ID);

        addCarFromLeft = new Button("Add car from left");
        addCarFromLeft.setId(C.ADD_CAR_FROM_LEFT_BUTTON_ID);

        addCarFromRight = new Button("Add car from right");
        addCarFromRight.setId(C.ADD_CAR_FROM_RIGHT_BUTTON_ID);

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

        start = new Start(addCarFromBack, addCarFromFront, addCarFromLeft, addCarFromRight, road);
        start.start();


    }
    public static void main(String[] args) {
        launch(args);


    }

}
