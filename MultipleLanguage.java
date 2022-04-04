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
public abstract class MultipleLanguage {

	void python() {
		System.out.println("Python is New Gen");
	}
	public abstract void ruby();
}
