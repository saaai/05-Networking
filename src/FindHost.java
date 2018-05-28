//java program to get the ip address of given website name

import java.net.InetAddress;
import java.net.UnknownHostException;

public class FindHost{
	public static void main (String args[])  throws UnknownHostException {
		
	//String hostName = "www.google.com";
	InetAddress ip = InetAddress.getByName("www.facebook.com");
	System.out.println(ip.getHostAddress());
	
	//ip.getHostAddress() -> return s the ip address string in textual representation
	
	}

}

/*we can't find multiple applications on a single port number
 * 
 * client should know the servers ip address and port number.
 * 
 * we should create an ouput channel for server and input channel for input
 * 		port number will be acting like a communication channel,
 * 		 	entry point or exit point for the particular channel
 * 
 * if your'e creating an object for the class it will be calling the constructor internally.
 * 
 * 
 * 
 * 
 * 
 */
