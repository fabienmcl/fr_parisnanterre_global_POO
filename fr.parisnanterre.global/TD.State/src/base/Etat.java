package base;

public interface Etat{

    public void askCoffee(Machine m);
    public void askTea(Machine m);
    public void give(Machine m, int n);
    public int getMoney();
}