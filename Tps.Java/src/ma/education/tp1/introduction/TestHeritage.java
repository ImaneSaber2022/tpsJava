package ma.education.tp1.introduction;
import ma.education.tp1.introduction.Salle;

public class TestHeritage {
    public static void main(String[] args) {
        Salle s1=new SalleDesCours("Salle 1", 1, 20);
        SalleDesCours s2= new SalleDesCours( "Salle 2", 2,20);
        SalleDesCours s3=(SalleDesCours)s1;
        SalleDesCours s4=s2;
        System.out.println(s1.id+" "+s1.nom);
        System.out.println(s2.id+" "+s2.nom+" "+s2.nbplcs);
        System.out.println(s3.id+" "+s3.nom+" "+s3.nbplcs);

        //question 8
        Salle l1 = new Laboratoire("LABO", 2, "CHIMIE");
        Laboratoire l2= new Laboratoire("Salle 2",2 , "physique");
        Laboratoire l3= (Laboratoire)l1;
        Laboratoire l4=l2;
        System.out.println(l1.id+" "+l1.nom);
        System.out.println(l2.id+" "+l2.nom+" "+l2.type);
        System.out.println(l3.id+" "+l3.nom+" "+l3.type);
    }
}
