package Computer;

public class CaseType {
    String brandName;
    String material;
    int width;
    int height;
    int length;
    int weight;
    boolean led;
    CaseType(String brandName, String material, int width, int height, int length, int weight, boolean led) {
        this.brandName = brandName;
        this.material = material;
        this.width = width;
        this.height = height;
        this.length = length;
        this.weight = weight;
        this.led = led;
    }
    @Override
    public String toString() {
        return "CaseType:" + "brandName= " + brandName + ", material= " + material + ", width" + width + "cm"
                + ", height= " + height + "cm" + ", length= " + length + "cm" + ", weight= " + weight + "kg" + ", led= " + (led ? "yes" : "no");
    }
}
