package base;

public class EtatNON implements Etat{
    int money;

    public EtatNON(){
        this.money = 0;
    }
    @Override
    public void askCoffee(Machine m) {
        System.out.println("askCoffee -> pas possible");
    }

    @Override
    public int getMoney() {
        return money;
    }

    @Override
    public void askTea(Machine m) {
        System.out.println("askTea -> pas possible");
    }

    @Override
    public void give(Machine m, int n) {
        this.money+=n;
        if(money>=10){
            m.setEtat(new EtatOUI(money));
        }
    }
}