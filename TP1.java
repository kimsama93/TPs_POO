
class Rectangle {

    private double Largeur;
    private double longueur;

    public double getLargeur(){
        return Largeur;
    }

    public double getLongeur(){
        return longueur;
    }

    public void setLargeur(double Largeur) {
        this.Largeur = Largeur;
    }

    public void setLongeur(double longeur) {
        this.longueur = longeur;
    }

    double surface(){
        return Largeur*longueur;
    }

    double perimetre(){
        return 2*(Largeur+longueur);
    }
}
class TP1_main{
    public static void main(String[] args) {
        Rectangle rect=new Rectangle();
        rect.setLargeur(6);
        rect.setLongeur(8.4);

//

        System.out.println("Surface : "+rect.surface());
        System.out.println("Perimetre : "+rect.perimetre());
    }
}