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
     * Costruttore della monoposto
     */
    public Monoposto(int ident, String scud, String pilota){
        this.ident = ident;
        this.scud = scud;
        this.pilota = pilota;
    }

    @Override
    public void run(){
        int tempo = (int)(Math.random()*4)+1;
        try {
            Thread.sleep(tempo*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(this.pilota + " ha cominciato la gara!");
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
