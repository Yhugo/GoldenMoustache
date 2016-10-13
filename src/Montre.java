import java.text.ParseException;
import java.util.Date;

/**
 * Created by Yohann Hugo on 13/10/2016.
 */
public class Montre extends Sujet{

    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date){
        this.date = date;
        this.notifie();
    }
}
