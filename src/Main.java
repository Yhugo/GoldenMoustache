/**
 * Created by Yohann Hugo on 13/10/2016.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        Montre m = new Montre();
        Timer t = new Timer(m);

        t.start();

        MontreDigitaleAnglaise mda = new MontreDigitaleAnglaise(m);
        MontreDigitaleFrancaise mdf = new MontreDigitaleFrancaise(m);
        try{
            t.wait();
        }catch (InterruptedException e){
            e.printStackTrace();
        }catch (IllegalMonitorStateException e){

        }
    }


}
