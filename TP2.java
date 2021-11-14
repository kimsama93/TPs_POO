class Patient {

    private double poids;
    private double taille;

    public double getPoids(){
        return poids;
    }

    public double getTaille(){
        return taille;
    }

    public void setPoids(double poids){
        this.poids=poids;
    }

    public void setTaille(double taille){
        this.taille=taille;
    }
    double IMC(){
        return poids/(taille*taille);
    }




}
class TP2_main{
    public static void main(String[] args) {
        Patient pat = new Patient();
        pat.setPoids(56);
        pat.setTaille(1.60);

        System.out.println("Poids du patient : "+pat.getPoids());
        System.out.println("Taille du patient : "+pat.getTaille());
        System.out.println("IMC du patient : "+pat.IMC());

    }}