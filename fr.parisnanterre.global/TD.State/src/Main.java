import base.Machine;

public class Main {
    public static void main (String[] args){
        Machine m = new Machine();
        m.askCoffee();
        m.give(10);
        m.askCoffee();
        m.askCoffee();
    }
}
