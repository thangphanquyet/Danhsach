

public class MyList {
    String ten;
    int tuoi;
    String angi;

    public MyList() {
    }

    public MyList(String ten, int tuoi, String angi) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.angi = angi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getAngi() {
        return angi;
    }

    public void setAngi(String angi) {
        this.angi = angi;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "tên: '" + ten + '\'' +
                ", tuổi: " + tuoi +
                ", ăn gì: '" + angi + '\'' +
                '}';
    }
}
