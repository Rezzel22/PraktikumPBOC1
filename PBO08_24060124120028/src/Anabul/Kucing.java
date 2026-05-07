    package Anabul;

    public class Kucing extends Anabul {
        /* Atribut */
        private int bobot;

        /*Konstruktor */
            // Konstruktor tak berparameter
        Kucing() {
            super();
            this.bobot = 0;
        }
        
            // Konstruktor berparameter
        Kucing(String Nama) {
            super(Nama);
            this.bobot = 0;
        }

            // Konstruktor berparameter + bobot
        Kucing(String Nama, int bobot) {
            super(Nama);
            this.bobot = bobot;
        }

        /*Selektor */
        public int getBobot() {
            return this.bobot;
        }

        /* Mutator */
        public void setBobot(int B) {
            this.bobot = B;
        }
        
        /*Method Tambahan */
        @Override
        public void Gerak() {
            System.out.println("Kucing " + (this.getNama() == "" ? "" : this.getNama() + " ") + "melata.");
        }

        @Override
        public void Bersuara() {
            System.out.println("meong");
        }
    }