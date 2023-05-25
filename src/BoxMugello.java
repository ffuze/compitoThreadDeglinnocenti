/**
 * Classe che rappresenta il box delle monoposto
 */
public class BoxMugello extends Thread{

    /**
     * Costruttore Box
     */
    public BoxMugello(){
    }
    /**
     * metodo pitStop() che fa entrare un pilota al pit stop
     * @param pilota
     */
    public void pitStop(String pilota) {
        System.out.println("PIT-STOP " + pilota + " cambio gomme in corso");

        int tempo = (int)(Math.random()*4)+1;
        try {
            Thread.sleep(tempo*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("PIT-STOP " + pilota + " FINITO");
    }
}