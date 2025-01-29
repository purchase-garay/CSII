import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class week2 {
    LocalTime time = LocalTime.now();
    String hour = time.format(DateTimeFormatter.ofPattern("HH"));
    String minute = time.format(DateTimeFormatter.ofPattern("mm"));
    String newTime = LocalTime.now().plusMinutes(55).format(DateTimeFormatter.ofPattern("HH:mm"));

    public void main(String[] args) throws Exception {
        System.out.println("The current time is " + hour + ":" + minute +".");
        System.out.println("In 55 minutes, it will be " + newTime);
    }
}
