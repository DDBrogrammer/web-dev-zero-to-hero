package Computer;
public class Computer {
    Processor processor;
    Ram ram;
    HDD hdd;
    MainBoard mainBoard;
    Screen screen;
    CaseType caseType;
    Keyboard keyboard;
    Mouse mouse;
    Computer(Processor processor, Ram ram, HDD hdd, MainBoard mainBoard, Screen screen, CaseType caseType,
             Keyboard keyBoard, Mouse mouse)
    {
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
        this.mainBoard = mainBoard;
        this.screen = screen;
        this.caseType = caseType;
        this.keyboard = keyBoard;
        this.mouse = mouse;
    }
    public String toString() {
        return "Computer {" +
                "\n Processor='" + processor +
                "\n RAM='" + ram +
                "\n HDD=" + hdd +
                "\n MainBoard='" + mainBoard +
                "\n Screen=" + screen +
                "\n Case=" + caseType +
                "\n Keyboard=" + keyboard +
                "\n Mouse=" + mouse + "}";
    }
    public static void main(String[] args) {
        Processor processor = new Processor("Intel", 2, 5, "x86-64", 10, 7, "DDR3", 30, 41);
        Ram ram = new Ram("Coisair", "DDR4", 16, 3200, 140, 42);
        HDD hdd = new HDD("Samsung", "new2024",1024, 100, 10);
        Screen screen = new Screen("MSI", "2K", "HDMI, VGA", 30, 16);
        CaseType caseType = new CaseType("Sama", "steel", 20, 30, 30, 15, true);
        Keyboard keyboard = new Keyboard("Razer", "Mechanic", "USB", 2, 1, 300, 200, true, true);
        Mouse mouse = new Mouse ("Razer", 16000, 30, 50, 20, 100, true, true);
        MainBoard mainBoard = new MainBoard("ASUS","LGA1700", 4,"DDR4", 4, 130, 30, 4, 4);
        Computer computer1 = new Computer(processor, ram, hdd, mainBoard, screen, caseType, keyboard, mouse);
        Computer computer2 = new Computer(processor, ram, hdd, mainBoard, screen, caseType, keyboard, mouse);
        Computer computer3 = new Computer(processor, ram, hdd, mainBoard, screen, caseType, keyboard, mouse);
        System.out.println(computer1);
        System.out.println(computer2);
        System.out.println(computer3);
    }
}
