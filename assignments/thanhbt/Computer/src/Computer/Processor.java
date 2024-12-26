package Computer;
public class Processor {
    String brandName;
    int clockSpeed;
    int cores;
    String kindOfArchitecture;
    int sizeOfCache;
    int processNode;
    String memorySupport;
    int width;
    int height;
    Processor(String brandName, int clockSpeed, int cores, String kindOfArchitecture, int sizeOfCache, int processNode,
                     String memorySupport, int width, int height) {
        this.brandName = brandName;
        this.clockSpeed = clockSpeed;
        this.cores = cores;
        this.kindOfArchitecture = kindOfArchitecture;
        this.sizeOfCache = sizeOfCache;
        this.processNode = processNode;
        this.memorySupport = memorySupport;
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Processor: " + "brandName= " + brandName + ", clockSpeed= " + clockSpeed + "GHz" + ", cores= " + cores +
                ", kindOfArchitecture= " + kindOfArchitecture + ", sizeOfCache= " + sizeOfCache + "Mb" + ", processNode= " + processNode + ", memorySupport="
                + memorySupport + ", width= " + width + "mm" + ", height= " + height + "mm";
    }
}
