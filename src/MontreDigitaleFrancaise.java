import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Yohann Hugo on 13/10/2016.
 */
public class MontreDigitaleFrancaise implements Observeur{


    public Montre montre;

    public MontreDigitaleFrancaise(Montre m){
        montre=m;
        this.montre.attache(this);
    }

    public void miseAJour(){
        SimpleDateFormat dt = new SimpleDateFormat("hh:mm:ss", Locale.FRANCE);
        System.out.println("Montre Française : "+dt.format(montre.getDate()));
    }
}
