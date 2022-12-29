package ma.education.tp1.introduction;

import ma.education.tp1.introduction.Salle;
public class SalleDesCours extends Salle{
public int nbplcs;

    public SalleDesCours(String nom, int id,int nbplcs) {
        super(nom, id);
        this.nbplcs = nbplcs;
    }
}
