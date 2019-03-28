package p2;

import java.math.BigDecimal;

public class soma {
	public static void main (String[] args) {
		
		problemDouble();
		
		problemString();
		
	}

	private static void problemString() {
		int MAX = 1000000;
		long t0sb = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < MAX; i++) {
			sb.append(i);
			
		}
		
		long t1sb = System.currentTimeMillis();
		long tStringBuilder = (t1sb-t0sb);
		System.out.println("Tempo concat StringBuilder (ms): " + tStringBuilder);

		
		
		long t0 = System.currentTimeMillis();
		String s = "";
		for (int i = 0; i < MAX; i++) {
			s += i;
		}
		 
		long t1 = System.currentTimeMillis();
		long tString = (t1-t0);
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
