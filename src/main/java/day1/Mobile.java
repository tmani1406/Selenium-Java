package day1;

public class Mobile {
		
		public String callsomeone (String friendName) {
			 String actual = friendName + "call picked"; 
					return actual;	
		}
		public String sendsms (String SMS) { 
		//System.out.println("Received");
		return SMS;
		}
		public void shutdown() {
			System.out.println("Shutdown");
	}

public static void main(String [] args) {
	
	Mobile Friend = new Mobile();
String c = Friend.callsomeone("tr");
 System.out.println(c);
 
 String d = Friend.sendsms("GT");
 System.out.println(d);
 
 Friend.shutdown();
 System.out.println("shut");
 
}
}





