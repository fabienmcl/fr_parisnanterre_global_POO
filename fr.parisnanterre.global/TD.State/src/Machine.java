public class Machine {

    private Etat etat;
    private int argent;

    public Machine(){
        this.etat=new EtatNON();
        this.argent = 0;
    }
    public void give(int n){
        argent+=n;
        if(argent>=10){
            //je me met en etat 1 -> peu avoir café
            etat = (etat instanceof EtatOUI) ? etat : new EtatOUI();
        }
    }
    /*
    public void askCoffee(){
        ask("askCoffee");
    }
    public void askTea(){
        ask("askTea");
    }
    public void ask(String name){
        System.out.print(name+" -> ");
        //test etat
        if(getEtat() instanceof EtatOUI){
            System.out.println(" ok ");
            this.argent = 0;
            setEtat(new EtatNON());
        }else{
            System.out.println(" pas possible ");
        }
    }

    */
    public void askCoffee(){
        this.etat.askCoffee(this);
    }
    public void askTea(){
        this.etat.askTea(this);
    }
    public Etat getEtat(){
        return etat;
    }
    public void setEtat(Etat e){
        this.etat = e;
    }

    public int getArgent() {
        return argent;
    }

    public void setArgent(int argent) {
        this.argent += argent;
    }
}
