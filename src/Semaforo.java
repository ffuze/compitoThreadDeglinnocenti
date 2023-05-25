public class Semaforo {
    /**
     * Stato del semaforo
     */
    private int stato;

    /**
     * Costruttore del semaforo
     * @param stato
     */
    public Semaforo(int stato){
        this.stato = stato;
    }

    /**
     * Metodo p() del semaforo
     */
    public synchronized void p(String pilota){
        while(stato == 0){
            try {
                System.out.println("---------------" + pilota + " in attesa al box---------------");
                wait(); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        stato = 1;
    }

    /**
     * Metodo v() del semaforo
     */
    public synchronized void v(){
        stato = 1;
        notify();
    }

    /**
     * Metodo get() dello stato
     * @return
     */
    public int getStato() {
        return stato;
    }
}
