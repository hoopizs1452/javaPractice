import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class dateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
		System.out.println(date);
		LocalTime time = LocalTime.now();
		System.out.println(time);
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		DateTimeFormatter dateTimeFunc = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String funcTimeDate = dateTime.format(dateTimeFunc);
		System.out.println(funcTimeDate);
	}

}
