public class Titik {
    /*Atribut*/
    double absis;
    double ordinat;

    /*Method */
    Titik(){
        absis = 0;
        ordinat = 0;
    }

    double getabsis(){
        return absis;
    }

    double getordinat(){
        return ordinat;
    }

    void setabsis(double x){
        absis = x;
    }

    void setordinat(double y){
        ordinat = y;
    }

    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    void printTitik(){
        System.out.println("Titik(" + absis + "," + ordinat + ")");
    }

    
}
