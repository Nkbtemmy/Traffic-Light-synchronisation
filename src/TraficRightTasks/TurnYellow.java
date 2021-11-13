package TraficRightTasks;

import main.TrafficLight;

public class TurnYellow implements Runnable{
    TrafficLight trafficLight;
    @Override
    public void run() {

    }
    public TurnYellow(TrafficLight trafficLight){
        this.trafficLight = trafficLight;
    }
}
