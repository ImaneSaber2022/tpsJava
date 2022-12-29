package ma.education.tp1.introduction;
import ma.education.tp1.introduction.Salle;
public class Laboratoire  extends Salle {
public String type;

    public Laboratoire(String nom, int id , String type) {
        super(nom, id);
        this.type = type;
    }
}
