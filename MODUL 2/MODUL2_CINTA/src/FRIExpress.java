public class FRIExpress extends Ekspedisi
{
    // TO DO: Create Protected Attribute of FRIExpress (pecahBelah)
    protected boolean pecahBelah;

    // TO DO: Create Constructor of FRIExpress
    public FRIExpress (int jumlahCabang, String pusat, float tarif, boolean pecahBelah){
        super(jumlahCabang,pusat,tarif)
        this.pecahBelah = pecahBelah;
    }

    // TO DO: Create 'informasi' Method to show Information
    public void informasi(boolean pecahBelah){
        System.out.println("Ekspedisi FRIExpress dengan jumlah cabang" + jumlahCabang + "dan pusat di" + pusat + "mempunyai tarif sebesar" + tarif + "perkilogram");
    })

    // TO DO: Create 'terima' Method to accept a number of packages
    public void terima(int jumlahPaket){
        System.out.println("FRIExpress baru saja menerima paket yang masuk untuk disortir sebanyak" + jumlahPaket + "paket");
    }

    // TO DO: Create 'kirim' Method to send a package to a destination
    public void kirim(String tujuan){
        System.out.println("FRIExpress berhasil mengirimkan paket ke tujuan" + tujuan);
    }

    // TO DO: Create 'kirim' Method to send a package to two destinations
    public void kirim(Sring tujuan_1, String tujuan_2){
        System.out.println("FRIExpress berhasil mengirikan pake ke tujuan" + tujuan_1 + "dan" + tujuan_2);
    }
}
