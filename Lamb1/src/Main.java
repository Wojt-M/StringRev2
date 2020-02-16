
public class Main {

	public static void main(String[] args) {
		
		Addition<String> plusString = (a,b) -> a + b;
		Addition<Integer> plusInteger = (a,b) -> a + b;
		
		
		System.out.println(plusInteger.sddSth(2, 2));
		System.out.println(plusString.sddSth("Ala ma ", "kota"));

	}

}
