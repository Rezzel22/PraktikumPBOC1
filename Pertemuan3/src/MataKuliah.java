public class MataKuliah {
    private String idMatkul;
    private String Nama;
    private int sks;

    public MataKuliah(){
        idMatkul = "";
        Nama = "";
        sks = 0;
    }

    public MataKuliah(String idMatkul, String Nama, int sks){
        this.idMatkul = idMatkul;
        this.Nama =  Nama;
        this.sks = sks;
    }

    //Selektor
    public String getIdMatkul(){
        return idMatkul;
    }

    public String getNamaMatkul(){
        return Nama;
    }

    public int getSks(){
        return sks;
    }

    //mutator
    public void setIdMatkul(String Id){
        idMatkul = Id;
    }

    public void setNama(String N){
        Nama = N;
    }

    public void setSks(int S){
        sks = S;
    }

    public void printMataKuliah(){
        System.out.println("Id MataKuliah :" + idMatkul + "Nama :" + Nama + "SKS :" + sks);
    }
}
