package Computer;

public class Screen {
    String brandName;
    String Resolution;
    String port;
    int size;
    int numberOfColor;
    Screen (String brandName, String Resolution, String port, int size, int numberOfColor) {
        this.brandName = brandName;
        this.Resolution = Resolution;
        this.port = port;
        this.size = size;
        this.numberOfColor = numberOfColor;
    }
    @Override
    public String toString() {
        return "Screen:" + "brandName= " + brandName + ", Resolution= " + Resolution
                + ", port= " + port + ", size= " + size + "inch" + ", numberOfColor= " + numberOfColor + "millions";
    }
}
