
public class AsterickLogger implements Logger{

	
	public void Log(String log) {
		System.out.println("***" + log + "***");
		
	}

	
	public void Error(String error) {
		System.out.println("******************" + "\n***Error: " + error + "***" + "\n******************");
		
		
	}

	

}
