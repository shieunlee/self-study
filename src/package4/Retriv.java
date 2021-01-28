package package4;

public class Retriv extends Dog{
	private String name = "Anndy";
	public static void main(String[] args) {
		
		Retriv mydog = new Retriv();
		mydog.barks();
		
		System.out.println(mydog.breed + "  " + mydog.name);
	}


}
