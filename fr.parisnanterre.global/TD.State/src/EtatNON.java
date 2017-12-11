public class EtatNON implements Etat {

    public void askCoffee(Machine m){
        ask(m,"askCoffee");
    }
    public void askTea(Machine m){
        ask(m,"askTea");
    }
    public void ask(Machine m,String name){
        System.out.print(name+" -> ");
        System.out.println(" pas possible ");

    }

    @Override
    public void give(Machine m, int n) {
        m.setArgent(n);
        if(m.getArgent()>10){
            m.setEtat(new EtatOUI());
        }
    }
}
