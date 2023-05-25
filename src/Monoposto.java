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
    public Monoposto(int ident, String scud, String pilota, Semaforo s, BoxMugello box){
        this.ident = ident;
        this.scud = scud;
        this.pilota = pilota;
        this.s = s;
        this.box = box;
    }

    /**
     * Override del metodo run() della classe Thread che fa continuare la gara
     */
    @Override
    public void run(){
        for(int i=1; i<=10; i++){
            if(i==3 || i==6 || i==9){
                s.p(this.pilota);
                box.pitStop(this.pilota);
                s.v();
            }
            System.out.println("GIRO-" + i + " Completato " + this.pilota);
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
