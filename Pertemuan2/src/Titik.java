public class Titik {
    //Atribut
    double absis;
    double ordinat;
    static int counterTitik = 0;

    //Konstruktor
    Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik ++;
    }

    static int getCounterTitik(){
        return counterTitik;
    }

    double getAbsis(){
        return absis;
    }

    double getOrdinat(){
        return ordinat;
    }

    void setAbsis(double x){
        absis = x;    
    }

    void setOrdinat(double y){
        ordinat = y;
    }

    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    void printTitik(){
        System.out.println("Titik(" + absis + "," + ordinat + ")");
    }

    Titik (double absis ,  double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik ++;
    }

    public int getKuadran(){
        if (absis > 0 && ordinat > 0)
            return 1;
        if (absis < 0 && ordinat > 0)
            return 2;
        if (absis < 0 && ordinat < 0)
            return 3;
        if (absis > 0 && ordinat < 0)
            return 4;
        else
            return 0;
    }

    public double getJarak(Titik t){
        return Math.sqrt(((this.absis - t.getAbsis()) * (this.absis - t.getAbsis())) + ((this.ordinat - t.getOrdinat()) * (this.ordinat - t.getOrdinat())));
    }

    public double getJarakPusat(){
        return Math.sqrt(this.absis * this.absis + this.ordinat * this.ordinat);
    }

    void refleksiX(){
        ordinat = ordinat * -1;
    }

    void refleksiY(){
        absis = absis * -1;
    }

    Titik getRefleksiX(){
        return new Titik(absis , ordinat * -1);
    }

    Titik getRefleksiY(){
        return new Titik(absis * -1 , ordinat);
    }
}