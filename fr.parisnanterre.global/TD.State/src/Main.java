import base.Machine;

public class Main {
    public static void main (String[] args){
        Machine m = new Machine();
        m.askCoffee();
        m.give(5);
        m.askCoffee();
        m.give(30);
        m.askCoffee();
        m.give(1);
        m.askCoffee();
    }
}
