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
}
