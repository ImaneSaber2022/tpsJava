package Héritage;

public class MainTest {
    double afficher(Forme f){
        {
    if (f instanceof Triangle){
    Triangle r= (Triangle) f;
    return ((Triangle)f).hauteur*((Triangle)f).base;
    }
    else if (f instanceof Cercle){
        Cercle c=(Cercle) f;
    }
    return ((Cercle)f).royan*((Cercle)f).royan*Math.PI;
    }
    }
}
