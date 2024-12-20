package Computer;

public class Ram {
    String brandName;
    String kind;
    int capacity;
    int speed;
    int width;
    int height;
    Ram(String brandName, String kind, int capacity, int speed, int width, int height) {
    this.brandName = brandName;
    this.kind = kind;
    this.capacity = capacity;
    this.speed = speed;
    this.width = width;
    this.height = height;
    }
    @Override
    public String toString() {
        return "RAM: " + "brandName= " + brandName + ", kind= " + kind + ", capacity= " + capacity + "GB" + ", speed= " + speed +
                ", width= " + width + "mm" + ", height= " + height + "mm";
    }
}
