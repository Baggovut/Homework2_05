package transport;

public abstract class Transport {
    private final String brand, model;
    private int engineCapacity;

    public Transport(String brand, String model, int engineCapacity) {
        if(brand == null || brand.isBlank()){
            this.brand = "default";
        }else{
            this.brand = brand;
        }
        if(model == null || model.isBlank()){
            this.model = "default";
        }else{
            this.model = model;
        }
        setEngineCapacity(engineCapacity);
    }

    public String getBrand() {
        return this.brand;
    }
    public String getModel() {
        return this.model;
    }

    public int getEngineCapacity() {
        return this.engineCapacity;
    }
    public void setEngineCapacity(int engineCapacity) {
        int defaultValue = 100;
        if(engineCapacity <= 0){
            this.engineCapacity = defaultValue;
        }else{
            this.engineCapacity = engineCapacity;
        }
    }

    public void startMotion(){
        System.out.println("Start motion;");
    }
    public void stopMotion(){
        System.out.println("Stop motion;");
    }

    abstract public void printType();
}
