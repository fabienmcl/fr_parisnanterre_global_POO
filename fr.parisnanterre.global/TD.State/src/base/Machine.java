package base;

public class Machine{

    private Etat etat;

    public Machine(){
        this.etat = new EtatNON();
    }

    public void give(int n){
        etat.give(this,n);
    }
    public void askCoffee(){
        etat.askCoffee(this);
    }
    public void askTea(){
        etat.askTea(this);
    }
    public void setEtat(Etat etat){
        this.etat = etat;
    }
    public Etat getEtat(){
        return etat;
    }
}