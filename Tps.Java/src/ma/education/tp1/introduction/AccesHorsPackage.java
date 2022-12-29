package ma.education.tp1.introduction;

public class AccesHorsPackage extends Salle {
    public AccesHorsPackage(String nom, int id) {
        super(nom, id);
    }

    public static void main(String[] args) {
        Salle s1 = new Salle("salle B");
        System.out.println(s1.id);
        System.out.println(s1.nom);

    } public void afficher(Salle s) {
        System.out.println(s.id );
        System.out.println(s.nom );
        System.out.println(id );
        System.out.println(nom );
    }

}
