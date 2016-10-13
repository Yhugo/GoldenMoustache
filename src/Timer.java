import java.text.ParseException;
import java.util.Date;

/**
 * Created by Yohann Hugo on 13/10/2016.
 */
public class Timer extends Thread {

    public Montre montre;

    public Timer(Montre montre){
        this.montre = montre;
    }

    @Override
    public void run() {
        while(true){
            try {
                this.montre.setDate(new Date());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
