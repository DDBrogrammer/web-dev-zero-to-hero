public class Computer {
    String processor;
    int ram;
    int hdd;
    String mainboard;
    String screen;
    String casename;
    String keyboard;
    String mouse;
    Computer(String processor, int ram, int hdd, String mainBoard, String screen, String caseName, String keyBoard, String mouse)
    {
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
        this.mainboard = mainBoard;
        this.screen = screen;
        this.casename = caseName;
        this.keyboard = keyBoard;
        this.mouse = mouse;
    }
    public String toString() {
        return "Computer {" + "Processor='" + processor + ", RAM='" + ram + "GB" + ", HDD=" + hdd + "GB" + ", MainBoard='" + mainboard + ", Screen=" + screen + ", Case=" + casename + ", Keyboard=" + keyboard + ", Mouse=" + mouse + "}";
    }
    public static void main(String[] args) {
        Computer computer1 = new Computer("Intel core i9", 16, 1, "micro ATX", "Samsung 24inch","Full tower" , "Fuhlen", "Fuhlen");
        Computer computer2 = new Computer("Intel core i5", 32, 2, "ITX mini", "MSI 24inch", "Full tower", "MSI", "Fuhlen");
        Computer computer3 = new Computer("Intel core i3", 64, 1, "EATX", "Samsung 27inch", "Full tower", "Fuhlen", "Fuhlen");
        System.out.println(computer1);
        System.out.println(computer2);
        System.out.println(computer3);
    }
}
