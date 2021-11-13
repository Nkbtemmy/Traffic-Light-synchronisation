package main;

import CarsTasks.CarComing;
import TraficRightTasks.TurnRed;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class Start extends Thread{
    TrafficLightControl controller;

    TrafficLight leftTrafficLight;
    TrafficLight rightTrafficLight;
    TrafficLight backTrafficLight;
    TrafficLight frontTrafficLight;

    Button addCarFromBack, addCarFromFront, addCarFromLeft, addCarFromRight;

    Start(Button addCarFromBack,Button addCarFromFront,Button addCarFromLeft,Button addCarFromRight){
        this.addCarFromBack = addCarFromBack;
        this.addCarFromFront = addCarFromFront;
        this.addCarFromRight = addCarFromRight;
        this.addCarFromLeft = addCarFromLeft;
    }
    @Override
    public void run(){
        leftTrafficLight = new TrafficLight(C.LEFT_TRAFFIC_LIGHT);
        rightTrafficLight = new TrafficLight(C.RIGHT_TRAFFIC_LIGHT);
        backTrafficLight = new TrafficLight(C.BACK_TRAFFIC_LIGHT);
        frontTrafficLight = new TrafficLight(C.FRONT_TRAFFIC_LIGHT);

        controller = new TrafficLightControl(leftTrafficLight,rightTrafficLight,backTrafficLight,frontTrafficLight);


        this.addCarFromLeft.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ((Button)event.getSource()).getId();
                Car car = new Car(C.CAR_FROM_LEFT);
                car.start();
            }
        });

        this.addCarFromRight.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Car car = new Car(C.CAR_FROM_RIGHT);
                car.start();
            }
        });
        this.addCarFromFront.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Car car = new Car(C.CAR_FROM_FRONT);
                car.start();
            }
        });
        this.addCarFromBack.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Car car = new Car(C.CAR_FROM_BACK);
                car.start();
            }
        });;


    }
}
