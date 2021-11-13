package CarsTasks;

import main.Car;

public class CarComing implements Runnable{
    Car car;
    @Override
    public void run() {

    }
    public CarComing(Car car){
        this.car = car;
    }
}
