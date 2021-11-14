import java.util.Scanner;

class Souris {
    private int poids;
    private String couleur;
    private int age;
    private int esperanceVie=36;
    private boolean estClonee;

    private final int ESPERANCE_VIE_DEFAUT=36;
    private final int AGE=0;

    public boolean getEstClonee(){
        return estClonee;
    }

    public int getEsperanceDevie(){
        return esperanceVie;
    }

    public Souris(int poids, String couleur) {
        this.poids = poids;
        this.couleur = couleur;
        this.age = AGE;
        this.esperanceVie=ESPERANCE_VIE_DEFAUT;
        this.estClonee = false;


        System.out.println("Une nouvelle sourie ! \n");
    }

    public Souris(Souris s) {
        this.poids = s.poids;
        this.couleur = s.couleur;
        this.age=s.age;
        this.esperanceVie=4*s.esperanceVie/5;
        this.estClonee=true;

        System.out.println("Clonage d'une sourie ! \n");

    }
    public String toString(){
        return estClonee? "Une souris "+couleur+" clonée de "+age+" mois et pesant "+poids+" grammes":
                "Une souris "+couleur+" de "+age+" mois et pesant "+poids+" grammes";
    }

    public void vieillir() {

        this.age+=1;
        if((estClonee) && (age>esperanceVie/2)){
            couleur="verte";

        }
    }

    public void evolue() {

        while(age!=esperanceVie){
            vieillir();

        }



    }


}



    class Main_TP4 {
        public static void main(String[] args) {
            Souris mouse1 = new Souris(50,"blanche");
            Souris mouse2 = new Souris(45,"grise");

            System.out.println(mouse1);


            System.out.println(mouse2);



            Souris mouse_clonee=new Souris(mouse2);
            System.out.println(mouse_clonee);


            mouse1.evolue();
            mouse2.evolue();
            mouse_clonee.evolue();


            System.out.println(mouse1);
            System.out.println(mouse2);
            System.out.println(mouse_clonee);




        }

    }


