
public class SpudCounter {
public static void main(String[] args) {
	String a= "Hot Potato";

   
	
}
static void speak(String words) {
  	 try {
  		 Runtime.getRuntime().exec("say " + words).waitFor();
  	 } catch (Exception e) {
  		 e.printStackTrace();
  	 }
 }
}
