package main;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;


public class Road extends StackPane {
    ImageView allInRed ;
    public Road(){
        allInRed = new ImageView(new Image("allRed.png"));
        allInRed.setFitHeight(C.ROAD_HEIGHT);
        allInRed.setFitWidth(C.ROAD_WIDTH);



        getChildren().add(allInRed);
    }
}
