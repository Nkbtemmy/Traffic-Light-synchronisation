package CarsTasks;

import main.C;
import main.Car;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import static java.util.concurrent.TimeUnit.SECONDS;

public class CarContinue implements Runnable {
    Car car;
    @Override
    public void run() {
        System.out.println("CAR   from "+car.getComingFromDirection()+"   "+car.toString()+" is continue ");
        final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        final Runnable Shaving = new Runnable() {

            int continueTime = C.CAR_CONTINUE_TIME;
            public void run() {

                if (continueTime < 0) {
                    scheduler.shutdown();

                }
                --continueTime;
            }
        };


        scheduler.scheduleAtFixedRate(Shaving, 0, 1, SECONDS);

    }
    public CarContinue(Car car){
        this.car = car;
    }
}
