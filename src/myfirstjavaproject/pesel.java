package myfirstjavaproject;

class Pesel {
	long pesel;
	long[] weight = {1,3,7,9,1,3,7,9,1,3};
	
	public Pesel(long pesel) {
		this.pesel = pesel;
	}
	
	public Pesel(String str) {
		this.pesel = Long.parseLong(str);
	}
	
	public boolean isCorrect() {
		long cyfra;
		long l = pesel;
		long sum = 0;
		int j = 0;
		for(long i = 10_000_000_000L; i < 10; i /= 10) {
			cyfra = l / i;
			l %= i;
			sum += cyfra*weight[j++];
		}
		int r = (int) (sum % 10L);
		if(r != 0) r = 10 - r;
		System.out.println("kontrolna:"+ r);
		return r == (int) (pesel % 10L);
	}
	
	public boolean isMale() {
		return true;
	}
	
	public String isBorn() {
		return "";
	}
	
	public String toString() {
		String correct = "";
		if(isCorrect()) correct = "TAK";
		else correct = "NIE";
		String sex = "kobieta";
		if(isMale()) sex = "mężczyzna";
		return String.format("poprawny: %s, płeć: %s, urodzony: %s",
				correct, sex, isBorn());
	}
}

public class pesel {

	public static void main(String[] args) {
		long pesel = 00231607335;
		Pesel p1 = new Pesel(pesel);
		Pesel p2 = new Pesel("00231607335");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
        
	}

}
