import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Date myDate = new Date();

        System.out.println(myDate);
        Locale loc = new Locale("it");

        DateFormat df = DateFormat.getDateInstance(DateFormat.DEFAULT, loc);

        String date = df.format(new Date());
        System.out.println(date);

        String pattern = "MM/dd/yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        date = sdf.format(new Date());
        System.out.println(date);

        User user = new User("Gianni", "Pippo", 1994, 02, 27);
        System.out.println(user);
//        System.out.println(sdf.format(user.getBorn()));
    }
}