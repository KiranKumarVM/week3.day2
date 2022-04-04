package week3.day2;
//Assignment on Abstraction
//===========
//Interface :Language
//     Methods   :Java()
//     Interface :TestTool
//     Methods   :Selenium()
//     AbstractClass :MultipleLangauge
//     Methods   :python() and un implemented method as ruby()
//  Execution class: Automation 
//Implement all the methods of interface and abstract class in Automation class
public class Automation extends MultipleLanguage implements Language,Selenium {

	public void ruby() {
		System.out.println("Ruby in Automation");
	}

	public void selenium() {
		System.out.println("Selenium in Automation");
	}

	public void java() {
		System.out.println("Java in automation");
		
	}
	public static void main(String[] args) {
		Automation auto = new Automation();
		auto.ruby();
		auto.java();
		auto.selenium();
		auto.python();
	}
	
}
