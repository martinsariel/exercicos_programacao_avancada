package exerciseJavaPoo.question3;

public class View {

	public static void main(String[] args) {
		
		MeioDeTransporte obj = new Terrestre(01, (short) 2000, "pum", 50.6, 10, 0.3);
				
System.out.println(obj.consumo());
	}

}
