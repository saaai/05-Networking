import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	public static void main (String args[]) throws IOException
	{
		ServerSocket ss = new ServerSocket(1099);
		System.out.println("trying to connect..");
		Socket s = ss.accept();//listens for a connection to be made to this socket and accepts it.
		System.out.println("Connected!!!");//we will get this msg after getting connected  
		//u shld msg from the socket , entire communication will happen only in socket.
		
		//from the socket we are trying to get the output stream, this is sockets outputstream
		OutputStream os = s.getOutputStream();//outputstream is for sending something out from this particular server .
		//after we get the outputstream we need to attach this to the printstream object
		//this OutputStream is not a normal outputstream, we are getting this one from the socket.
		PrintStream out = new PrintStream(os);//creating printstream object and passing output stream through it. 
		
		//this out.println() is going to send the message to the above outputstream 
		//out.println("hi how are you?");
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		
		String msg= "";
				while (  !(msg = br.readLine()).equals("exit") )
				{
					out.println(msg);
				}
		s.close();
		ss.close();
	}

}
