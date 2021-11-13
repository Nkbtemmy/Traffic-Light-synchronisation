package TraficRightTasks;

import main.C;
import main.TrafficLight;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import static java.util.concurrent.TimeUnit.SECONDS;

public class TurnRed implements Runnable{
    TrafficLight trafficLight;
    @Override
    public void run() {
        System.out.println("TrafficLight at "+trafficLight.getPosition()+" Turn red ");
        final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        final Runnable Shaving = new Runnable() {

            public void run() {

                if (trafficLight.getStatus() != C.TRAFFIC_LIGHT_IS_IN_RED) {
                    scheduler.shutdown();
                }
            }
        };


        scheduler.scheduleAtFixedRate(Shaving, 0, 1, SECONDS);


    }
    public TurnRed(TrafficLight trafficLight){
        this.trafficLight = trafficLight;
    }
}
