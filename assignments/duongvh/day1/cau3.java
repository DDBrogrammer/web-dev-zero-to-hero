class Hinh {
    private int chieuCao; // chieu cao (cm)
    private int canNang;  // can nang (kg)
    private int doTuoi;   // do tuoi (nam)

    public Hinh(int chieuCao, int canNang, int doTuoi) {
        this.chieuCao = chieuCao;
        this.canNang = canNang;
        this.doTuoi = doTuoi;
    }

    public void changeChieuCao(int newChieuCao) {
        this.chieuCao = newChieuCao;
    }

    public void changeCanNang(int newCanNang) {
        this.canNang = newCanNang;
    }

    public void changeDoTuoi(int newDoTuoi) {
        this.doTuoi = newDoTuoi;
    }

    public void printInfo() {
        System.out.println("Chieu cao: " + chieuCao + " cm");
        System.out.println("Can nang: " + canNang + " kg");
        System.out.println("Do tuoi: " + doTuoi + " nam");
    }
}

class GangTay {
    private String kichThuoc;      // kich thuoc (S, M, L, XL)
    private String mauSac;         // mau sac
    private String chatLieu;       // chat lieu

    public GangTay(String kichThuoc, String mauSac, String chatLieu) {
        this.kichThuoc = kichThuoc;
        this.mauSac = mauSac;
        this.chatLieu = chatLieu;
    }

    public void changeKichThuoc(String newKichThuoc) {
        this.kichThuoc = newKichThuoc;
    }

    public void changeMauSac(String newMauSac) {
        this.mauSac = newMauSac;
    }

    public void changeChatLieu(String newChatLieu) {
        this.chatLieu = newChatLieu;
    }

    public void printInfo() {
        System.out.println("Kich thuoc: " + kichThuoc);
        System.out.println("Mau sac: " + mauSac);
        System.out.println("Chat lieu: " + chatLieu);
    }
}

class DoiGiay {
    private String kichThuoc;      // kich thuoc (39, 40, 41, 42, ...)
    private String mauSac;         // mau sac
    private String chatLieu;       // chat lieu

    public DoiGiay(String kichThuoc, String mauSac, String chatLieu) {
        this.kichThuoc = kichThuoc;
        this.mauSac = mauSac;
        this.chatLieu = chatLieu;
    }

    public void changeKichThuoc(String newKichThuoc) {
        this.kichThuoc = newKichThuoc;
    }

    public void changeMauSac(String newMauSac) {
        this.mauSac = newMauSac;
    }

    public void changeChatLieu(String newChatLieu) {
        this.chatLieu = newChatLieu;
    }

    public void printInfo() {
        System.out.println("Kich thuoc: " + kichThuoc);
        System.out.println("Mau sac: " + mauSac);
        System.out.println("Chat lieu: " + chatLieu);
    }
}

public class Main {
    public static void main(String[] args) {
        // Tao doi tuong Hinh
        Hinh person = new Hinh(180, 75, 21);
        System.out.println("Thong tin cua hinh :");
        person.printInfo();

        // Thay doi  thuoc tinh cua hinh 
        person.changeChieuCao(200);
        person.changeCanNang(80);
        person.changeDoTuoi(25);
        System.out.println("Thong tin sau khi thay doi:");
        person.printInfo();

        // Tao doi tuong GangTay
        GangTay glove = new GangTay("M", "Do", "Da");
        System.out.println("\nThong tin cua gang tay:");
        glove.printInfo();

        // Thay doi  thuoc tinh cua gang tay
        glove.changeKichThuoc("L");
        glove.changeMauSac("Xanh");
        glove.changeChatLieu("Vai");
        System.out.println("Thong tin gang tay sau khi thay doi:");
        glove.printInfo();

        // Tao doi tuong DoiGiay
        DoiGiay shoes = new DoiGiay("40", "Den", "Da tong hop");
        System.out.println("\nThong tin cua doi giay:");
        shoes.printInfo();

        // Thay doi  thuoc tinh cua doi giay
        shoes.changeKichThuoc("41");
        shoes.changeMauSac("Nau");
        shoes.changeChatLieu("Vai");
        System.out.println("Thong tin doi giay sau khi thay doi:");
        shoes.printInfo();
    }
}
