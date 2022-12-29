package ma.education.tp.test;

import ma.education.tpsingeton.Soleil;

public class Test {
    public static void main(String[] args) {
        Soleil s1 = Soleil.getInstance(10000);
       // Soleil s2 = Soleil.getInstance(20000);
        s1.traiter();
        System.out.println(s1.surface);
        System.out.println(s1.surface);

    }
}
