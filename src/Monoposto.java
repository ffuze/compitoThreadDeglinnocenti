import javax.swing.Box;

/**
 * Classe Monoposto
 */
public class Monoposto extends Thread{
    /**
     * L'identificativo della monoposto
     */
    private int ident;

    /**
     * Scuderia del pilota
     */
    private String scud;

    /**
     * Nome del pilota
     */
    private String pilota;

    /**
     * Definizione della box
     */
    private BoxMugello box;

    /**
     * Definizione del semaforo
     */
    private Semaforo s;
    
    /**
     * Costruttore della monoposto
     */
    public Monoposto(int ident, String scud, String pilota){
        this.ident = ident;
        this.scud = scud;
        this.pilota = pilota;
    }

    /**
     * Override del metodo run() della classe Thread
     */
    @Override
    public void run(){
        int contGomme=1;
        for(int giri=1; giri<=10; giri++, contGomme++){
            if(contGomme==3){
                contGomme=0;
                s.p(this.pilota);
                box.pitStop(this.pilota);
                s.v();
            }
            System.out.println("GIRO-" + giri + " Completato " + this.pilota);
            try {
                int tempo = (int)(Math.random()*5)+1;
                Thread.sleep(tempo*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * metodo get() dell'identificativo
     * @return
     */
    public int getIdent() {
        return ident;
    }

    /**
     * metodo get() della scuderia
     * @return
     */
    public String getScud() {
        return scud;
    }

    /**
     * metodo get() del pilota
     * @return
     */
    public String getPilota() {
        return pilota;
    }
}
