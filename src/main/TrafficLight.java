package main;

import TraficRightTasks.TurnGreen;
import TraficRightTasks.TurnRed;
import TraficRightTasks.TurnYellow;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class TrafficLight {
    // like in red/green/...
    private StringProperty status = new SimpleStringProperty(C.TRAFFIC_LIGHT_IS_IN_RED);
    private String position;

    Thread trafficLightTurnRed;
    Thread trafficLightTurnGreen;
    Thread trafficLightTurnYellow;
    public TrafficLight(String position){
        this.position = position;
    }
    public void turnRed(){
        trafficLightTurnRed = new Thread(new TurnRed(this));
        trafficLightTurnRed.start();
    }
    public void turnGreen(){
        trafficLightTurnGreen = new Thread(new TurnGreen(this));
        trafficLightTurnGreen.start();
    }
    public void turnYellow(){
        trafficLightTurnYellow = new Thread(new TurnYellow(this));
        trafficLightTurnYellow.start();


    }

    public String getStatus() {
        return status.getValue();
    }

    public StringProperty statusProperty() {
        return status;
    }

    public void setStatus(String status) {
        this.status.setValue(status);
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
