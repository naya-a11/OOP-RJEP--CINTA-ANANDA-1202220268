public class MainApp {
    public static void main(String[] args) {
        Kendaraan kendaraan = new Kendaraan("270", 120.0, 4);
        System.out.println("Informasi Kendaraan:\n" + kendaraan.toString());
        System.out.println("Waktu Tempuh: " + kendaraan.hitungWaktuTempuh(300) + " jam");

        Mobil mobil = new Mobil("246", 150.0, 5, 4);
        System.out.println("\nInformasi Mobil:\n" + mobil.toString());

        Bus bus = new Bus("032", 100.0, 20, 40);
        System.out.println("\nInformasi Bus:\n" + bus.toString());
    }
}