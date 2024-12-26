package Computer;

public class HDD {
    String brandName;
    String model;
    int capacity;
    int speed;
    int size;
    HDD (String brandName, String model, int capacity, int speed, int size) {
        this.brandName = brandName;
        this.model = model;
        this.capacity = capacity;
        this.speed = speed;
        this.size = size;
    }
    @Override
    public String toString() {
        return "HDD: " + "brandName= " + brandName + ", model= " + model + ", capacity= " + capacity + ", speed= " + speed
                + "MB" + ", size= "  + size + "inch";
    }
}
