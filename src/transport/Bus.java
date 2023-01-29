package transport;

import driver.DriverCategoryD;
import enums.BusTypes;

public class Bus<T extends DriverCategoryD> extends Transport implements Competing{
    private T driver;
    private BusTypes busType;
    public Bus(String brand, String model, int engineCapacity, T driver, BusTypes busType) {
        super(brand, model, engineCapacity);
        this.driver = driver;
        this.busType = busType;
    }

    public T getDriver() {
        return driver;
    }

    @Override
    public void pitStop() {
        System.out.println("Truck Пит-стоп");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Truck лучшее время круга");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Truck максимальная скорость");
    }

    @Override
    public String toString() {
        return "Автобус={" +
                "Марка = '" + getBrand() + '\'' +
                ", модель = '" + getModel() + '\'' +
                ", объем двигателя = '" + getEngineCapacity() + '\'' +
                '}';
    }
    public String homeworkTask(){
        if(getDriver() == null){
            return "Автобус никуда не поедет без водителя.";
        }else{
            return "Водитель " + getDriver().getFullName() + " управляет автобусом " + getBrand() + " " + getModel() +
                    " и будет участвовать в заезде.";
        }
    }

    public BusTypes getBusType() {
        return busType;
    }

    public void setBusType(BusTypes busType) {
        this.busType = busType;
    }

    @Override
    public void printType() {
        if(busType == null){
            System.out.println("Данных по транспортному средству недостаточно.");
        }else{
            System.out.println(busType.name());
        }
    }
}
