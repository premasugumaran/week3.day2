package week3.day2;

public class Automation extends  MultipleLangauge implements Language,TestTool{

		// TODO Auto-generated method stub

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		
	}

	public void Selenium() {
		System.out.println("Selenium");
		
	}

	public void java() {
	System.out.println("java");
		
	}
	public static void main(String[] args) {

	Automation auto =new Automation();
auto.Selenium();
auto.java();
auto.python();
auto.ruby();
}

	}
