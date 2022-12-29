package ma.education.tpsingeton;

public class Soleil {
    private static Soleil instance;
    public double surface;

    private Soleil(double surface){
        this.surface = surface;
    }
    public  static Soleil getInstance(double surface){
        if (instance == null)
        {
            instance = new Soleil(surface);
        }
        return instance;
    }
 public  void traiter(){
     System.out.println("afficcher");
 }

}
