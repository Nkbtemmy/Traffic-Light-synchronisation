package CarsTasks;

import main.C;
import main.Car;
import main.TrafficLightControl;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import static java.util.concurrent.TimeUnit.SECONDS;

public class CarCheckLight implements Runnable{
    Car car;
    @Override
    public void run() {
        System.out.println("car from "+car.getComingFromDirection()+" CheckingLight  "+car.toString());
        final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        final Runnable Shaving = new Runnable() {

            public void run() {

                if (TrafficLightControl.carCanItPass(car.getComingFromDirection())) {
                    scheduler.shutdown();

                    Thread carContinueT = new Thread(new CarContinue(car));
                    carContinueT.start();
                }
            }
        };


        scheduler.scheduleAtFixedRate(Shaving, 0, 1, SECONDS);

    }
    CarCheckLight(Car car){
        this.car = car;
    }
}
