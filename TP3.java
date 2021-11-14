import java.util.Scanner;

class Tirelire {
    private double montant;

    public double getMontant() {
        return montant;
    }

    public void afficher() {
        if (this.montant == 0) {
            System.out.println("Vous êtes sans le sou, la tirelire ne contient pas d’argent ");
        } else {
            System.out.println("Vous avez " + this.montant + " euros dans votre tirelire");
        }
    }

    public void secouer() {
        if (this.montant > 0) {
            System.out.println("Bing Bing \n ");
        }
    }

    public void remplir(double ajout) {
        if (ajout > 0) {

            this.montant += ajout;
        }
    }

    public void vider() {
        this.montant = 0;
    }

    public void puiser(double prelevement) {
        if (prelevement > this.montant) {
            this.vider();
        } else if (prelevement < 0) {
            this.montant = montant;
        } else {
            this.montant -= prelevement;
        }
    }

    public double calculerSolde(double budget) {
        return budget <= 0 ? this.montant : this.montant - budget;
    }


    public Tirelire(double montant) {
        this.montant = montant;

    }


}


class Main_TP3 {
    public static void main(String[] args) {
        Tirelire tir = new Tirelire(0);

        //Affichage des données de la tirelire
        tir.afficher();

        tir.secouer();

        //Ajouter de l'argent à ma tirelire
        tir.remplir(550);

        tir.secouer();

        tir.afficher();


        //prendre de l'argent de ma tirelire

        tir.puiser(15);

        tir.afficher();

        //Calcul solde par rapport au budget

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Veuillez donner le budget de vos vacances \n");
        double budget = keyboard.nextDouble();
        System.out.println("Le solde calculé est " + tir.calculerSolde(budget));

        if (tir.calculerSolde(budget) < 0) {
            System.out.println("Il vous manque " + Math.abs(tir.calculerSolde(budget)) + " euros pour partir en vacances");
        } else {
            System.out.println("Vous êtes assez riche pour partir en vacances ! il vous restera "
                    + tir.calculerSolde(budget) + "euros à l'entrée");
        }


        System.out.println("montant restant : " + tir.getMontant());

        tir.vider();

        tir.afficher();

    }
    }

