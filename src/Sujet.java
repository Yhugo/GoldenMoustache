import java.text.ParseException;
import java.util.LinkedHashSet;

/**
 * Created by Yohann Hugo on 13/10/2016.
 */
public class Sujet {

    public LinkedHashSet<Observeur> observeurs = new LinkedHashSet<Observeur>();

    public void attache(Observeur o){
        observeurs.add(o);
    }

    public void detache(Observeur o){
        observeurs.remove(o);
    }

    public void detacheTous(){
        observeurs.clear();
    }

    public void notifie(){
        for(Observeur o : observeurs){
            o.miseAJour();
        }
    }
}
