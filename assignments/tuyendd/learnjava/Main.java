public class Main {
  public static void main(String[] args) {
    // Tạo mảng chứa 3 phần tử Computer
    Computer[] computers = new Computer[3];

    // Khởi tạo các đối tượng Computer
    computers[0] = new Computer("Intel Core i5", 16, 512, "ASUS B560", "Dell 24 inch", "Cooler Master", "Logitech K120", "Logitech G203");
    computers[1] = new Computer("AMD Ryzen 5", 8, 256, "MSI B450", "Samsung 27 inch", "Corsair", "Razer Cynosa", "Razer DeathAdder");
    computers[2] = new Computer("Intel Core i7", 32, 1024, "Gigabyte Z590", "LG 34 inch", "NZXT", "SteelSeries Apex", "SteelSeries Rival 600");

    // In thông tin các phần tử trong mảng
    for (int i = 0; i < computers.length; i++) {
      System.out.println("Thông tin Computer " + (i + 1) + ":");
      computers[i].displayInfo();
    }
  }
}
