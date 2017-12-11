public class EtatOUI implements Etat {

    public void askCoffee(Machine m){
        ask(m,"askCoffee");
    }
    public void askTea(Machine m){
        ask(m,"askTea");
    }
    public void ask(Machine m,String name){
        System.out.print(name+" -> ");

        if(m.getEtat()==this){
            System.out.println(" ok ");
            m.setArgent(0);
            m.setEtat(new EtatNON());
        }else{
            System.out.println(" pas possible ");
        }
    }

    @Override
    public void give(Machine m, int n) {

    }
}
