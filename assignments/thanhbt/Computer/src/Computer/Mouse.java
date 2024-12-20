package Computer;

public class Mouse {
    String brandName;
    int dpi;
    int width;
    int height;
    int length;
    int weight;
    boolean led;
    boolean supportSoftware;
    Mouse (String brandName, int dpi, int width, int height, int length, int weight, boolean led, boolean supportSoftware) {
        this.brandName = brandName;
        this.dpi = dpi;
        this.width = width;
        this.height = height;
        this.length = length;
        this.weight = weight;
        this.led = led;
        this.supportSoftware = supportSoftware;
    }
    @Override
    public String toString() {
        return "Mouse:" + "brandName= " + brandName + ", DPI= " + dpi + ", width= " + width + "mm" + ", height= " + height
                + "mm" + ", length= " + length + "mm" + ", weight= " + weight + "g" + ", led= " + (led ? "yes" : "no")
                + ", supportSoftware= " + (supportSoftware ? "yes" : "no");
    }
}
