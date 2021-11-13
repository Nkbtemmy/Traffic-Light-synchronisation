package main;

public class Car {
    private String comingFromDirection;

    public String getComingFromDirection() {
        return comingFromDirection;
    }

    public void setComingFromDirection(String comingFromDirection) {
        this.comingFromDirection = comingFromDirection;
    }

    public Car(String comingFromDirection){
        this.comingFromDirection = comingFromDirection;
    }
}
