package package1;

public class Access1 {
	
	public String pub = "나는 어디에서나 가능하단다.";
	protected String prt = "다른 package와 자손 클래스 내에서도 가능하단다.";
	String dft = "같은 패키지 내에서만 사용 가능하단다.";
	private String prv= "같은 클래스 내에서만 access가능하다.";
}



