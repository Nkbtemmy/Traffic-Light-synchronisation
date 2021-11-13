package CarsTasks;

import main.C;
import main.Car;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import static java.util.concurrent.TimeUnit.SECONDS;

public class CarComing implements Runnable{
    Car car;
    @Override
    public void run() {
        System.out.println("CAR   from "+car.getComingFromDirection()+"  "+car.toString()+" is coming ");
        final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        final Runnable Shaving = new Runnable() {

            int comingTime = C.CAR_COMING_TIME;
            public void run() {

                if (comingTime < 0) {
                    scheduler.shutdown();


                    Thread checkLight = new Thread(new CarCheckLight(car));
                    checkLight.start();
                }
                --comingTime;
            }
        };


        scheduler.scheduleAtFixedRate(Shaving, 0, 1, SECONDS);


    }
    public CarComing(Car car){
        this.car = car;
    }
}
