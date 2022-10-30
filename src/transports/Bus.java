package transports;

public class Bus extends Transport implements Competing {

    private TypeOfCapacity typeOfCapacity;

    public Bus(String brand, String model, double engineVolume, TypeOfCapacity typeOfCapacity) {
        super(brand, model, engineVolume);
        this.typeOfCapacity = typeOfCapacity;
    }

    public TypeOfCapacity getTypeOfCapacity() {
        return typeOfCapacity;
    }

    public void setTypeOfCapacity(TypeOfCapacity typeOfCapacity) {
        this.typeOfCapacity = typeOfCapacity;
    }

    @Override
    public void startMoving() {
        System.out.println("начать движение");
    }

    @Override
    public void finishTheMovement() {
        System.out.println("закончить движение");
    }

    @Override
    public void printType() {
        if (typeOfCapacity == null) {
            System.out.println("Данных недостаточно");
        } else {
            System.out.println("ВместимостЬ людей в автобусе:- от " + typeOfCapacity.getFrom() +
                    " до " + typeOfCapacity.getTo() + " людей");
        }
    }

    @Override
    public String toString() {
        return "Автобус: " + super.toString();
    }

    @Override
    public void getPitStop() {
        System.out.println("Сделать остановку автобусу");
    }

    @Override
    public void getBestTime() {
        System.out.println("Лучшее время круга автобуса");
    }

    @Override
    public void getMaxSpeed() {
        System.out.println("Максимальная скорость автобуса за круг ");
    }
}
