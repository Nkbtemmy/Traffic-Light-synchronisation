package TraficRightTasks;

import main.C;
import main.TrafficLight;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import static java.util.concurrent.TimeUnit.SECONDS;

public class TurnGreen implements Runnable{
    TrafficLight trafficLight;
    @Override
    public void run() {

        System.out.println("TrafficLight at "+trafficLight.getPosition()+" Turn green ");
        final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        final Runnable Shaving = new Runnable() {

            int greenTime = C.TRAFFIC_LIGHT_TIME_IN_GREEN;
            public void run() {

                if (greenTime < 0) {
                    trafficLight.setStatus(C.TRAFFIC_LIGHT_IS_IN_YELLOW);

                    scheduler.shutdown();
                }
                --greenTime;
            }
        };


        scheduler.scheduleAtFixedRate(Shaving, 0, 1, SECONDS);


    }
    public TurnGreen(TrafficLight trafficLight){
        this.trafficLight = trafficLight;

    }
}
