public class Konser {
    // TODO: Create Private Attribute of Konser (Band Name, Date, Location, Ticket Price) then Create Setter and Getter
    private String nama_Band;
    private String Tanggal;
    private String Lokasi;
    private String harga_tiket;
    
    public void setnama_Band (String nama_Band) {
        this.nama_Band = nama_Band;
    }

    public void setTanggal (String Tanggal) {
        this.Tanggal = Tanggal;
    }

    public void setLokasi (String Lokasi) {
        this.Lokasi = Lokasi;
    }

    public void setharga_tiket (String harga_tiket) {
        this.harga_tiket = harga_tiket;
    }

    public String getnama_Band() {
        return nama_Band;
    }

    public String gettanggal() {
        return Tanggal;
    }

    public String getlokasi() {
        return Lokasi;
    }

    public String getharga_tiket() {
        return harga_tiket;
    }

}