package ma.etudiant.tp.heritage;

public class Test {
    public static void main(String[] args) {
        Personne p1 = new Etudiant();
        Personne p2 = new Professeur();
        Personne p3 = new Personne();
        Etudiant e1 = new Etudiant();
        Professeur p4 = new Professeur();
        Etudiant e2 = (Etudiant)p1;
        Professeur p5 = (Professeur)p2;
        System.out.println(p4.salaire);
        System.out.println(e2.note);
        System.out.println(p5.salaire);
        System.out.println(e1.note);


    }
}
