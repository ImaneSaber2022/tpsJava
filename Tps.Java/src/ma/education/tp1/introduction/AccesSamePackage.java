package ma.education.tp1.introduction;
import ma.education.tp1.introduction.Salle;
public class AccesSamePackage extends Salle {
    public AccesSamePackage(String nom, int id) {
        super(nom, id);
    }

    public static void main(String[] args) {
        Salle s1 = new Salle("salle A");
        System.out.println(s1.id);
        System.out.println(s1.nom);
    }
}
