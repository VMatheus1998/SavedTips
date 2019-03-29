package p2;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Calendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Soma {
	public static void main(String[] args) throws ParseException {

		problemDouble();

		problemString();

		problemDate();

		problemCalendar();
		
		for (int i = 0; i < args.length; i++) {
			
			
		}

	}

	private static void problemCalendar() {
		Calendar cal = Calendar.getInstance();
		Date now = cal.getTime();
		System.out.println(cal);
		System.out.println(now);
		int mes = cal.get(Calendar.MONTH);
		int dia = cal.get(Calendar.DAY_OF_MONTH);
		int ano = cal.get(Calendar.YEAR);
		int hora = cal.get(Calendar.HOUR);
		int minuto = cal.get(Calendar.MINUTE);
		int segundo = cal.get(Calendar.SECOND);
		System.out.println(dia + "/" + mes + "/" + ano + " - " + hora + ":" + minuto + ":" + segundo);
	}

	public static void problemDate() throws ParseException {

		Date data = new Date();
		SimpleDateFormat ss = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
		System.out.println(ss.format(data));
		System.out.println(ss.parse("31/03/2019 01:00:00 PM"));

	}

	private static void problemString() {
		int MAX = 10000;
		long t0sb = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < MAX; i++) {
			sb.append(i);

		}

		long t1sb = System.currentTimeMillis();
		long tStringBuilder = (t1sb - t0sb);
		System.out.println("Tempo concat StringBuilder (ms): " + tStringBuilder);

		long t0 = System.currentTimeMillis();
		@SuppressWarnings("unused")
		String s = "";
		for (int i = 0; i < MAX; i++) {
			s += i;
		}

		long t1 = System.currentTimeMillis();
		long tString = (t1 - t0);
		System.out.println("Tempo concat String (ms): " + tString);
	}

	private static void problemDouble() {
		double x = 0.1;
		double y = 0.2;
		double z = x + y;
		System.out.println(z);

		float x1 = (float) 0.1;
		float y1 = (float) 0.2;
		float z1 = (float) (x1 + y1);
		System.out.println(z1);

		BigDecimal v1a = new BigDecimal(0.1);
		BigDecimal v2a = new BigDecimal(0.2);
		BigDecimal v3a = v1a.add(v2a);
		System.out.println(v3a);

		BigDecimal v1b = new BigDecimal("0.1");
		BigDecimal v2b = new BigDecimal("0.2");
		BigDecimal v3b = v1b.add(v2b);
		System.out.println(v3b);
	}

}