package main;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;

import java.util.Objects;
import java.util.concurrent.LinkedBlockingQueue;

public class TrafficLightControl {
    private static String trafficLightInGreenPosition;
    private TrafficLight leftTrafficLight, rightTrafficLight, backTrafficLight, frontTrafficLight;
    private LinkedBlockingQueue<TrafficLight> trafficLightQueue = new LinkedBlockingQueue<>();



    public TrafficLightControl(TrafficLight leftTrafficLight, TrafficLight rightTrafficLight, TrafficLight backTrafficLight, TrafficLight frontTrafficLight){
        this.backTrafficLight = backTrafficLight;
        this.frontTrafficLight = frontTrafficLight;
        this.rightTrafficLight = rightTrafficLight;
        this.leftTrafficLight = leftTrafficLight;

        trafficLightQueue.add(backTrafficLight);
        trafficLightQueue.add(frontTrafficLight);
        trafficLightQueue.add(rightTrafficLight);
        trafficLightQueue.add(leftTrafficLight);

        this.leftTrafficLight.statusProperty().addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
                System.out.println("status change");

                switch (leftTrafficLight.getStatus()){
                    case C.TRAFFIC_LIGHT_IS_IN_YELLOW: {
                        leftTrafficLight.turnYellow();
                        break;
                    }
                    case C.TRAFFIC_LIGHT_IS_IN_RED:{
                        leftTrafficLight.turnRed();
                        control();
                        break;
                    }
                    default:{
                        break;
                    }
                }
            }
        });
        this.rightTrafficLight.statusProperty().addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
                System.out.println("status change");
                switch (rightTrafficLight.getStatus()){
                    case C.TRAFFIC_LIGHT_IS_IN_YELLOW: {
                        rightTrafficLight.turnYellow();
                        break;
                    }
                    case C.TRAFFIC_LIGHT_IS_IN_RED:{
                        rightTrafficLight.turnRed();
                        control();
                        break;
                    }
                    default:{
                        break;
                    }
                }
            }
        });
        this.frontTrafficLight.statusProperty().addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
                System.out.println("status change");
                switch (frontTrafficLight.getStatus()){
                    case C.TRAFFIC_LIGHT_IS_IN_YELLOW: {
                        frontTrafficLight.turnYellow();
                        break;
                    }
                    case C.TRAFFIC_LIGHT_IS_IN_RED:{
                        frontTrafficLight.turnRed();
                        control();
                        break;
                    }
                    default:{
                        break;
                    }
                }
            }
        });
        this.backTrafficLight.statusProperty().addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
                System.out.println("status change");
                switch (backTrafficLight.getStatus()){
                    case C.TRAFFIC_LIGHT_IS_IN_YELLOW: {
                        backTrafficLight.turnYellow();
                        break;
                    }
                    case C.TRAFFIC_LIGHT_IS_IN_RED:{
                        backTrafficLight.turnRed();
                        control();
                        break;
                    }
                    default:{
                        break;
                    }
                }
            }
        });

        control();
    }

    private void control() {
        TrafficLight currentTrafficRight = trafficLightQueue.poll();
        trafficLightQueue.add(currentTrafficRight);

        trafficLightInGreenPosition = currentTrafficRight.getPosition();

        currentTrafficRight.setStatus(C.TRAFFIC_LIGHT_IS_IN_GREEN);
        currentTrafficRight.turnGreen();
    }

    public static boolean carCanItPass(String comingFromDirection){
        if(Objects.equals(comingFromDirection, C.CAR_FROM_LEFT) && trafficLightInGreenPosition == C.LEFT_TRAFFIC_LIGHT){
            return true;
        }
        else if(comingFromDirection == C.CAR_FROM_FRONT && trafficLightInGreenPosition == C.FRONT_TRAFFIC_LIGHT){
            return true;
        }
        else if(comingFromDirection == C.CAR_FROM_BACK && trafficLightInGreenPosition == C.BACK_TRAFFIC_LIGHT){
            return true;
        }
        else if(comingFromDirection == C.CAR_FROM_RIGHT && trafficLightInGreenPosition == C.RIGHT_TRAFFIC_LIGHT){
            return true;
        }
        else {
            return false;
        }
    }


}
