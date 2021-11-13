package TraficRightTasks;

import main.C;
import main.TrafficLight;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import static java.util.concurrent.TimeUnit.SECONDS;

public class TurnYellow implements Runnable{
    TrafficLight trafficLight;
    @Override
    public void run() {
        System.out.println("TrafficLight at "+trafficLight.getPosition()+" Turn yellow ");
        final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        final Runnable Shaving = new Runnable() {

            int yellowTime = C.TRAFFIC_LIGHT_TIME_IN_YELLOW;
            public void run() {


                if (yellowTime < 0) {
                    trafficLight.setStatus(C.TRAFFIC_LIGHT_IS_IN_RED);

                    scheduler.shutdown();
                }
                --yellowTime;
            }
        };


        scheduler.scheduleAtFixedRate(Shaving, 0, 1, SECONDS);


    }
    public TurnYellow(TrafficLight trafficLight){
        this.trafficLight = trafficLight;
    }
}
