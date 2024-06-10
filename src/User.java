import java.util.Date;
import java.util.GregorianCalendar;

public class User {

    private String name;
    private String surname;
    private Date born;

    public User (String name, String surname, int year, int month, int day) {
        this.name = name;
        this.surname = surname;
        GregorianCalendar c = new GregorianCalendar(year, month, day);
        this.born = c.getTime();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBorn() {
        return born;
    }

    public void setBorn(Date born) {
        this.born = born;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", born=" + born +
                '}';
    }
}
