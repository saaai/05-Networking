import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
	public static void main (String args[]) throws IOException{
		Socket s = new Socket("localhost", 1099);
		/*creating socket object , inside passing host name and port number,
		 * 		local host means it's in the same machine.
		 * 
		 * 
		 * 
		 */
		 InputStream in = s.getInputStream();
		 InputStreamReader isr = new InputStreamReader(in);
		 BufferedReader br = new BufferedReader(isr);
		 
		 String msg = "";
		 while((msg = br.readLine() )!= null)
			 /* it will be keep on calling the readLine(),if there's something in the readLine() it and it stores the value in msg variable 
			  * 	if the msg is null it will come out of the loop,
			  * 		 if not it will execute the print statement.
			  */
		 
		 {
		
		 System.err.println("from server: " +msg);
		 }
		 
		s.close();//closing the socket connection. 
		
	}

}
