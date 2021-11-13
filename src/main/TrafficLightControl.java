package main;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;

public class TrafficLightControl {
    public String trafficLightInGreen;
    private TrafficLight leftTrafficLight, rightTrafficLight, backTrafficLight, frontTrafficLight;



    public TrafficLightControl(TrafficLight leftTrafficLight, TrafficLight rightTrafficLight, TrafficLight backTrafficLight, TrafficLight frontTrafficLight){
        this.backTrafficLight = backTrafficLight;
        this.frontTrafficLight = frontTrafficLight;
        this.rightTrafficLight = rightTrafficLight;
        this.leftTrafficLight = leftTrafficLight;

        this.leftTrafficLight.statusProperty().addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
                System.out.println("status change");
            }
        });
        this.rightTrafficLight.statusProperty().addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
                System.out.println("status change");
            }
        });
        this.frontTrafficLight.statusProperty().addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
                System.out.println("status change");
            }
        });
        this.backTrafficLight.statusProperty().addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
                System.out.println("status change");
            }
        });


    }
    public TrafficLight getGreenTrafficLight(){
        return null;
    }


}
