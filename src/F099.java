import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class F099 {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		System.out.println("----------------ANTES----------------");

		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

		System.out.println(sdf.format(d));

		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		int minutes = cal.get(Calendar.MINUTE);
		int hours = cal.get(Calendar.HOUR_OF_DAY);
		int mes = 1 + cal.get(Calendar.MONTH);

		System.out.println("Mês = " + mes);
		System.out.println("Horas = " + hours);
		System.out.println("Minutes = " + minutes);

	}
}
