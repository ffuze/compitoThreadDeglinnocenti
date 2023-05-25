public class BoxMugello extends Thread{

    public BoxMugello(){
    }

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