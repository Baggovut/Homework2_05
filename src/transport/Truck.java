package transport;

import driver.DriverCategoryC;
import enums.TruckTypes;

public class Truck<T extends DriverCategoryC> extends Transport implements Competing{
    private T driver;
    private TruckTypes truckType;
    public Truck(String brand, String model, int engineCapacity, T driver, TruckTypes truckType) {
        super(brand,model,engineCapacity);
        this.driver = driver;
        this.truckType = truckType;
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
        return "Грузовой автомобиль={" +
                "Марка = '" + getBrand() + '\'' +
                ", модель = '" + getModel() + '\'' +
                ", объем двигателя = '" + getEngineCapacity() + '\'' +
                '}';
    }
    public String homeworkTask(){
        if(getDriver() == null){
            return "Автомобиль никуда не поедет без водителя.";
        }else{
            return "Водитель " + getDriver().getFullName() + " управляет грузовым автомобилем " + getBrand() + " " + getModel() +
                    " и будет участвовать в заезде.";
        }
    }

    public TruckTypes getTruckType() {
        return truckType;
    }

    public void setTruckType(TruckTypes truckType) {
        this.truckType = truckType;
    }

    @Override
    public void printType() {
        if(truckType == null){
            System.out.println("Данных по транспортному средству недостаточно.");
        }else{
            System.out.println(truckType.name());
        }
    }
}

