package transports;

public abstract class Transport {

    private final String brand;
    private final String model;
    private final double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "Укажите бренд";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty()) {
            this.model = "Укажите модель";
        } else {
            this.model = model;
        }
        if (engineVolume < 0) {
            this.engineVolume = 0;
            System.out.println("Укажите объем двигателя");
        } else {
            this.engineVolume = engineVolume;
        }

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void startMoving() {
        System.out.println("Метод начать движение");
    }

    public void finishTheMovement() {
        System.out.println(" Метод закончить движение");
    }

    public abstract void printType();

    @Override
    public String toString() {
        return "transports.Transport {" +
                "brand = '" + brand + '\'' +
                ", model = '" + model + '\'' +
                ", engineVolume = " + engineVolume +
                '}';
    }
}
