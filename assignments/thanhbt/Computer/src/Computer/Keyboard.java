package Computer;

public class Keyboard {
    String brandName;
    String keyType;
    String kindPort;
    int numberOfPress;
    int weight;
    int length;
    int width;
    boolean led;
    boolean numPad;
    Keyboard(String brandName, String keyType, String kindPort, int numberOfPress, int weight,
             int length, int width, boolean led, boolean numPad) {
        this.brandName = brandName;
        this.keyType = keyType;
        this.kindPort = kindPort;
        this.numberOfPress = numberOfPress;
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.led = led;
        this.numPad = numPad;
    }
    @Override
    public String toString() {
        return "Keyboard: " + "brandName= " + brandName + ", keyType= " + keyType + ", kindPort= " + kindPort
                + ", numberOfPress= " + numberOfPress + "millions" + ", weight= " + weight + "kg" + ", length= " + length + ", width= " + width
                + ", led= " + (led ? "yes" : "no") + ", numPad= " + (numPad ? "yes" : "no");
    }
}
