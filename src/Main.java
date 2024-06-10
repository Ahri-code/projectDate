import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws ParseException {
        Date myDate = new Date();

        System.out.println(myDate);
        Locale loc = new Locale("it");

        DateFormat df = DateFormat.getDateInstance(DateFormat.DEFAULT, loc);

        String date = df.format(new Date());
        System.out.println(date);

        String pattern = "EEEE dd MMMM yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        date = sdf.format(new Date());
        System.out.println(date);

        User user = new User("Gianni", "Pippo", 1994, 02, 27);
        System.out.println(user);
//        System.out.println(sdf.format(user.getBorn()));

        Date d = new Date();
        String dateString = "10/06/2024";

        sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            d = sdf.parse(dateString);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        SimpleDateFormat sdfOutput = new SimpleDateFormat(pattern, loc);
        System.out.println(sdfOutput.format(d));

//      Convert from util to sql
        java.util.Date utilDate = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

//      Convert gregorian to util
        GregorianCalendar gcal = new GregorianCalendar();
        utilDate = gcal.getTime();

//      Convert gregorian to sql
        sqlDate = new java.sql.Date(gcal.getTime().getTime());

//      Convert sql to util
        sqlDate = new java.sql.Date(new Date().getTime());
        utilDate = new java.sql.Date(sqlDate.getTime());

//      Convert gregorian to util
        gcal.setTime(utilDate);
    }
}