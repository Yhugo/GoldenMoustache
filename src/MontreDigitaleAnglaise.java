import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Yohann Hugo on 13/10/2016.
 */
public class MontreDigitaleAnglaise implements Observeur {

    public Montre montre;

    public MontreDigitaleAnglaise(Montre m){
        montre=m;
        this.montre.attache(this);
    }

    public void miseAJour(){
        SimpleDateFormat dt = new SimpleDateFormat("hh:mm:ss a", Locale.UK);
        System.out.println("English Watch : "+dt.format(montre.getDate()));
    }
}