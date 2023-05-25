/**
 * Classe semaforo
 */
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
        stato--;
    }

    /**
     * Metodo v() del semaforo
     */
    public synchronized void v(){
        stato++;
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
