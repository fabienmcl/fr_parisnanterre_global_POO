package base;

public class EtatOUI implements Etat{
    int money;

    public EtatOUI(int money) {
        this.money = money;
    }

    @Override
    public void askCoffee(Machine m) {
        System.out.println("askCoffee -> ok");
        m.setEtat(new EtatNON());
    }

    @Override
    public void askTea(Machine m) {
        System.out.println("askTea -> ok");
        m.setEtat(new EtatNON());
    }

    @Override
    public void give(Machine m, int n) {
        money+=n;
    }

    @Override
    public int getMoney() {
        return money;
    }
}