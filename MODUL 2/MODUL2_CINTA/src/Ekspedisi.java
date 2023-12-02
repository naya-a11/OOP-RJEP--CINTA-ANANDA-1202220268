public class Ekspedisi{
    // TO DO: Create Protected Attributes of Ekspedisi (jumlahCabang, pusat, tarif)
    Protected int jumlahCabang;
    Protected String pusat;
    Protected float tarif;

    // TO DO: Create Constructor of Ekspedisi
    public Ekspedisi(int jumlahCabang, String pusat, float tafif){
        this.jumlahCabang = jumlahCabang;
        this.pusat = pusat;
        this.tarif = tarif;
    }

    // TO DO: Create 'informasi' Method to show Information
    public void Informasi{
        System.out.println("Ekspedisi tidak diketahui dengan jumlahCabang" + jumlahCabang + "dan berpusat di" + pusat + "mempunyai tarif sebesar" + tarif + "perkilogram");
    }
}