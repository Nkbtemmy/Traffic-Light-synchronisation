package TraficRightTasks;

import main.TrafficLight;

public class TurnRed implements Runnable{
    TrafficLight trafficLight;
    @Override
    public void run() {

    }
    public TurnRed(TrafficLight trafficLight){
        this.trafficLight = trafficLight;
    }
}
