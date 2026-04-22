/* Nama File : IResize.java
 * Deskripsi : Interface IResize untuk mengubah ukuran bangun datar
 * Pembuat   : Imam Alfarezel
 * Tanggal   : 15/04/2026
 */


public interface IResize {
    //Method untuk menambah ukuran
    public void zoomIn();

    //Method untuk mengurangi ukuran
    public void zoomOut();

    //Method untuk menskalakan ukuran dalam bentuk persen
    public void zoom(int percent);
}
