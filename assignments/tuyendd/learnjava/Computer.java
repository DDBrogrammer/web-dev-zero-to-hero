public class Computer {
  private String processor;
  private int ram; // Dung lượng RAM (GB)
  private int hdd; // Dung lượng HDD (GB)
  private String mainBoard;
  private String screen;
  private String pcCase;
  private String keyboard;
  private String mouse;

  // Constructor
  public Computer(String processor, int ram, int hdd, String mainBoard, String screen, String pcCase, String keyboard, String mouse) {
    this.processor = processor;
    this.ram = ram;
    this.hdd = hdd;
    this.mainBoard = mainBoard;
    this.screen = screen;
    this.pcCase = pcCase;
    this.keyboard = keyboard;
    this.mouse = mouse;
  }

  // Phương thức in thông tin của máy tính
  public void displayInfo() {
    System.out.println("Processor: " + processor);
    System.out.println("RAM: " + ram + "GB");
    System.out.println("HDD: " + hdd + "GB");
    System.out.println("Mainboard: " + mainBoard);
    System.out.println("Screen: " + screen);
    System.out.println("Case: " + pcCase);
    System.out.println("Keyboard: " + keyboard);
    System.out.println("Mouse: " + mouse);
    System.out.println("--------------------------");
  }
}

// Lớp chính

