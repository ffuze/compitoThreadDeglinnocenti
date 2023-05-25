public class App {
    public static void main(String[] args) throws Exception {
        BoxMugello box = new BoxMugello();
        Semaforo s = new Semaforo(1);

        Monoposto m1 = new Monoposto(1, "Ferrari", "Leclerc", s, box);
        Monoposto m2 = new Monoposto(2, "Mercedes", "Bottas", s, box);
        Monoposto m3 = new Monoposto(0, "Ferrari", "Hamilton", s, box);
        Monoposto m4 = new Monoposto(0, "Ferrari", "Perez", s, box);
        Monoposto m5 = new Monoposto(0, "Ferrari", "Verstappen", s, box);

        m1.start();
        m2.start();
        m3.start();
        m4.start();
        m5.start();

        m1.join();
        m2.join();
        m3.join();
        m4.join();
        m5.join();

        System.out.println("Gara Finita");
    }
}
