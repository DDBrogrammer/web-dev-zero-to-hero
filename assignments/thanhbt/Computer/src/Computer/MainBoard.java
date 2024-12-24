package Computer;

public class MainBoard {
    String brandName;
    String kindofSocketCPU;
    int numberofRam;
    String ramKind;
    int numberofSATA;
    int width;
    int height;
    int numberOfConnectionsPort;
    int airRadiator;
    MainBoard
            (String brandName, String kindofSocketCPU, int numberofRam, String ramKind, int numberofSATA, int width, int height,
             int numberOfConnectionsPort, int airRadiator) {
        this.brandName = brandName;
        this.kindofSocketCPU = kindofSocketCPU;
        this.numberofRam = numberofRam;
        this.ramKind = ramKind;
        this.numberofSATA = numberofSATA;
        this.width = width;
        this.height = height;
        this.numberOfConnectionsPort = numberOfConnectionsPort;
        this.airRadiator = airRadiator;
    }
    @Override
    public String toString() {
        return "MainBoard: " + "brandName= " + brandName + ", kindofSocketCPU= " + kindofSocketCPU
                + ", numberofRam= " + numberofRam + ", ram= " + ramKind
                + ", numberofSATA= " + numberofSATA + ", width= " + width + "mm" + ", height= " + height + "mm"
                + ", numberOfConnectionsPort= " + numberOfConnectionsPort + ", airRadiator= " + airRadiator;
    }
}
