public class Anjing {
    String nama;
    String jenis;
    int umur;
    String gender;

    Anjing(String nama, String jenis, int umur, String gender) {
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
        this.gender = gender;
    }

    public void mengonggong() {
        System.out.println("GUK GUK");
    }
    public void perkenalan() {
        System.out.println("GUK GUK!! Nama saya " + this.nama + ". Saya merupakan seekor anjing jenis " + this.jenis + ". Umur saya " + this.umur + ". Saya berjenis kelamin " + this.gender);
    }
    public void tidur() {
        System.out.println("zzz");
        System.out.println(this.nama + " sedang tidur. Mohon jangan diganggu.");
    }
    public void play(String objek) {
        System.out.println(this.nama + " sedang bermain dengan "+ objek);
    }

}
