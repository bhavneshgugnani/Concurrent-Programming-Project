package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

public class Testing {
	//DATA IN REQUEST
	//private static String request = "8734UIA6\ntrue,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic\n100\n100\n100\n100\n100\n100\n100\n100\n150\n100\n100\n150\n100\n100\n100\n400\n100\n100\n100\n100\n28378327.1075840036940.JavaMail.evans@thyme	Fri, 30 Nov 2001 12:09:39 -0800 (PST)	estrickland@mieco.com	mswerzb@enron.com		couple things\n1752967.1075840036795.JavaMail.evans@thyme	Sun, 2 Dec 2001 19:45:26 -0800 (PST)	chairman.ken@enron.com	dl-ga-all_enron_worldwide2@enron.com		Enron Files Chapter 11 Reorganization\n28378327.1075840036940.JavaMail.evans@thyme	Fri, 30 Nov 2001 12:09:39 -0800 (PST)	estrickland@mieco.com	mswerzb@enron.com		couple things\n1752967.1075840036795.JavaMail.evans@thyme	Sun, 2 Dec 2001 19:45:26 -0800 (PST)	chairman.ken@enron.com	dl-ga-all_enron_worldwide2@enron.com		Enron Files Chapter 11 Reorganization\n28378327.1075840036940.JavaMail.evans@thyme	Fri, 30 Nov 2001 12:09:39 -0800 (PST)	estrickland@mieco.com	mswerzb@enron.com		couple things\n1752967.1075840036795.JavaMail.evans@thyme	Sun, 2 Dec 2001 19:45:26 -0800 (PST)	chairman.ken@enron.com	dl-ga-all_enron_worldwide2@enron.com		Enron Files Chapter 11 Reorganization\n28378327.1075840036940.JavaMail.evans@thyme	Fri, 30 Nov 2001 12:09:39 -0800 (PST)	estrickland@mieco.com	mswerzb@enron.com		couple things\n1752967.1075840036795.JavaMail.evans@thyme	Sun, 2 Dec 2001 19:45:26 -0800 (PST)	chairman.ken@enron.com	dl-ga-all_enron_worldwide2@enron.com		Enron Files Chapter 11 Reorganization\n28378327.1075840036940.JavaMail.evans@thyme	Fri, 30 Nov 2001 12:09:39 -0800 (PST)	estrickland@mieco.com	mswerzb@enron.com		couple things\n1752967.1075840036795.JavaMail.evans@thyme	Sun, 2 Dec 2001 19:45:26 -0800 (PST)	chairman.ken@enron.com	dl-ga-all_enron_worldwide2@enron.com		Enron Files Chapter 11 Reorganization";
	//private static String request = "8734UIA6\ntrue,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic\n100\n100\n100\n100\n100\n100\n100\n100\n150\n100\n100\n150\n100\n100\n100\n400\n100\n100\n100\n100\nd:\\CPinput.tab\nd:\\CPoutput.tab";
	//private static String request = "8734UIA6\nfalse,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic\n100\n100\n100\n100\n100\nd:\\CPinput.tab\nd:\\CPoutput.tab";
	//private static String request = "8734UIA6\ntrue,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic\n200\n500\n200\n200\n200\n200\n200\n200\n200\n200\n200\n500\n200\n200\n200\n200\n200\n200\n200\n200\n200\n200\n200\n500\n200\n200\n200\n200\n200\n200\n28378327.1075840036940.JavaMail.evans@thyme	Fri, 30 Nov 2001 12:09:39 -0800 (PST)	estrickland@mieco.com	mswerzb@enron.com		couple things\n1752967.1075840036795.JavaMail.evans@thyme	Sun, 2 Dec 2001 19:45:26 -0800 (PST)	chairman.ken@enron.com	dl-ga-all_enron_worldwide2@enron.com		Enron Files Chapter 11 Reorganization\n28378327.1075840036940.JavaMail.evans@thyme	Fri, 30 Nov 2001 12:09:39 -0800 (PST)	estrickland@mieco.com	mswerzb@enron.com		couple things\n1752967.1075840036795.JavaMail.evans@thyme	Sun, 2 Dec 2001 19:45:26 -0800 (PST)	chairman.ken@enron.com	dl-ga-all_enron_worldwide2@enron.com		Enron Files Chapter 11 Reorganization\n28378327.1075840036940.JavaMail.evans@thyme	Fri, 30 Nov 2001 12:09:39 -0800 (PST)	estrickland@mieco.com	mswerzb@enron.com		couple things\n1752967.1075840036795.JavaMail.evans@thyme	Sun, 2 Dec 2001 19:45:26 -0800 (PST)	chairman.ken@enron.com	dl-ga-all_enron_worldwide2@enron.com		Enron Files Chapter 11 Reorganization\n28378327.1075840036940.JavaMail.evans@thyme	Fri, 30 Nov 2001 12:09:39 -0800 (PST)	estrickland@mieco.com	mswerzb@enron.com		couple things\n1752967.1075840036795.JavaMail.evans@thyme	Sun, 2 Dec 2001 19:45:26 -0800 (PST)	chairman.ken@enron.com	dl-ga-all_enron_worldwide2@enron.com		Enron Files Chapter 11 Reorganization\n28378327.1075840036940.JavaMail.evans@thyme	Fri, 30 Nov 2001 12:09:39 -0800 (PST)	estrickland@mieco.com	mswerzb@enron.com		couple things\n1752967.1075840036795.JavaMail.evans@thyme	Sun, 2 Dec 2001 19:45:26 -0800 (PST)	chairman.ken@enron.com	dl-ga-all_enron_worldwide2@enron.com		Enron Files Chapter 11 Reorganization";
	private static String request = "8734UIA6\nfalse,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic\n200\n500\n200\n200\n200\n200\n200\n200\n200\n200\n200\n500\n200\n200\n200\n200\n200\n200\n200\n200\n200\n200\n200\n500\n200\n200\n200\n200\n200\n200\nd:\\CPinput.tab\nd:\\CPoutput.tab";
	//private static String request = "8734UIA6\nfalse,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic\n300\n300\n300\n300\n300\n300\n300\n600\n300\n300\n300\n300\n100\n300\n100\n600\n300\n300\n300\n300\n300\n300\n300\n600\n300\n300\n300\n300\n100\n300\n300\n1000\n100\n300\n100\n300\n300\n300\n300\n300\nd:\\CPinput.tab\nd:\\CPoutput.tab";
	//private static String request = "false,variableformatparsing\n\t,1,2\nc:\\CPinput.tab\nc:\\CPoutput.tab";	
	
	
	public static void main(String[] args) {
		run();
	}
	
	public static void run(){
		try{
			
			long time;
			
			Thread.currentThread().sleep(1000);
			Socket clientSocket = new Socket();
			SocketAddress socketAddress = new InetSocketAddress("172.16.110.163", 8090);
			clientSocket.connect(socketAddress);
		
			DataInputStream input = new DataInputStream(clientSocket.getInputStream());
			PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), false);
			writer.println(request);
			time = System.nanoTime();
			writer.flush();
			clientSocket.shutdownOutput();
			
			while(input.available() == 0);
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			String line;
			String res = reader.readLine();
			String ress = res.substring(0, 1);
			time = System.nanoTime() - time;
			//while ((line = reader.readLine()) != null) {
			//	res += "/n" + line;
			//}
			System.out.println("Response : " + ress);
			System.out.println("Response : " + res);
			System.out.println("TIME : " + time + " ns");
			clientSocket.shutdownInput();
			
			clientSocket.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
