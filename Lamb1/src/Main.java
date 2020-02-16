
public class Main {

	public static void main(String[] args) {
		
		Addition<String> plusString = (a,b) -> a + b;
		Addition<Integer> plusInteger = (a,b) -> a + b;
		
		
		System.out.println(plusInteger.addSth(2, 2));
		System.out.println(plusString.addSth("Ala ma ", "kota"));

	}

}
