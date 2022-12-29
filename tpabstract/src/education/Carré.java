package education;

public class Carré  extends Forme{
    private int cote;

    public Carré(int cote) {
        this.cote = cote;
    }

    @Override
    public void calculerSurface() {
        System.out.println("la surface est "+cote*cote);
    }
}
