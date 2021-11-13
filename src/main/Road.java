package main;

import javafx.application.Platform;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;


public class Road extends StackPane {
    ImageView allInRed ;
    public Road(){
        getChildren().clear();
        allInRed = new ImageView(new Image("allRed.png"));
        allInRed.setFitHeight(C.ROAD_HEIGHT);
        allInRed.setFitWidth(C.ROAD_WIDTH);
        getChildren().add(allInRed);

    }
    public void leftGreenUpdate(){
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                getChildren().clear();
                allInRed = new ImageView(new Image("leftGreen.png"));
                allInRed.setFitHeight(C.ROAD_HEIGHT);
                allInRed.setFitWidth(C.ROAD_WIDTH);
                getChildren().add(allInRed);
            }
        });
    }
    public void leftYellowUpdate(){
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                getChildren().clear();
                allInRed = new ImageView(new Image("leftYellow.png"));
                allInRed.setFitHeight(C.ROAD_HEIGHT);
                allInRed.setFitWidth(C.ROAD_WIDTH);
                getChildren().add(allInRed);
            }
        });
    }


    public void rightGreenUpdate(){
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                getChildren().clear();
                allInRed = new ImageView(new Image("rightGreen.png"));
                allInRed.setFitHeight(C.ROAD_HEIGHT);
                allInRed.setFitWidth(C.ROAD_WIDTH);
                getChildren().add(allInRed);
            }
        });
    }
    public void rightYellowUpdate(){
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                getChildren().clear();
                allInRed = new ImageView(new Image("rightYellow.png"));
                allInRed.setFitHeight(C.ROAD_HEIGHT);
                allInRed.setFitWidth(C.ROAD_WIDTH);
                getChildren().add(allInRed);
            }
        });
    }


    public void frontGreenUpdate(){
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                getChildren().clear();
                allInRed = new ImageView(new Image("frontGreen.png"));
                allInRed.setFitHeight(C.ROAD_HEIGHT);
                allInRed.setFitWidth(C.ROAD_WIDTH);
                getChildren().add(allInRed);
            }
        });
    }
    public void frontYellowUpdate(){
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                getChildren().clear();
                allInRed = new ImageView(new Image("frontYellow.png"));
                allInRed.setFitHeight(C.ROAD_HEIGHT);
                allInRed.setFitWidth(C.ROAD_WIDTH);
                getChildren().add(allInRed);
            }
        });
    }


    public void backGreenUpdate(){
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                getChildren().clear();
                allInRed = new ImageView(new Image("backGreen.png"));
                allInRed.setFitHeight(C.ROAD_HEIGHT);
                allInRed.setFitWidth(C.ROAD_WIDTH);
                getChildren().add(allInRed);
            }
        });
    }
    public void backYellowUpdate(){
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                getChildren().clear();
                allInRed = new ImageView(new Image("backYellow.png"));
                allInRed.setFitHeight(C.ROAD_HEIGHT);
                allInRed.setFitWidth(C.ROAD_WIDTH);
                getChildren().add(allInRed);
            }
        });
    }


    public void allReadUpdate() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                getChildren().clear();
                allInRed = new ImageView(new Image("allRed.png"));
                allInRed.setFitHeight(C.ROAD_HEIGHT);
                allInRed.setFitWidth(C.ROAD_WIDTH);
                getChildren().add(allInRed);
            }
        });
    }
}
