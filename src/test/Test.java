package test;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class Test {
	//private static String request = "true,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic\n100\n100\n100\n100\n100\n100\n100\n100\n100\n100\nBy using (or loving) LAMP you are opening yourself up to the big bad world of web apps. Web application testing is a huge field and endless time can be spent making up new and interesting scenarios with just the framework LAMP provides. However that’s not very useful as practical advice so here are some suggestions:Login Bypass is an easy vulnerability to replicate and easy to fit into a larger exercise as well. Depending on your mood you can provide magic parameters, authentication integrity failures, credentials in comments, user agent responses, or even the odd fail-open. There’s a lot to try out there, experimenting is the best way to go.";
	private static String request = "8734UIA6\ntrue,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic,mimickedbusinesslogic\n200\n500\n200\n200\n200\n200\n200\n200\n200\n200\n200\n500\n200\n200\n200\n200\n200\n200\n200\n200\n200\n200\n200\n500\n200\n200\n200\n200\n200\n200\n28378327.1075840036940.JavaMail.evans@thyme	Fri, 30 Nov 2001 12:09:39 -0800 (PST)	estrickland@mieco.com	mswerzb@enron.com		couple things\n1752967.1075840036795.JavaMail.evans@thyme	Sun, 2 Dec 2001 19:45:26 -0800 (PST)	chairman.ken@enron.com	dl-ga-all_enron_worldwide2@enron.com		Enron Files Chapter 11 Reorganization\n28378327.1075840036940.JavaMail.evans@thyme	Fri, 30 Nov 2001 12:09:39 -0800 (PST)	estrickland@mieco.com	mswerzb@enron.com		couple things\n1752967.1075840036795.JavaMail.evans@thyme	Sun, 2 Dec 2001 19:45:26 -0800 (PST)	chairman.ken@enron.com	dl-ga-all_enron_worldwide2@enron.com		Enron Files Chapter 11 Reorganization\n28378327.1075840036940.JavaMail.evans@thyme	Fri, 30 Nov 2001 12:09:39 -0800 (PST)	estrickland@mieco.com	mswerzb@enron.com		couple things\n1752967.1075840036795.JavaMail.evans@thyme	Sun, 2 Dec 2001 19:45:26 -0800 (PST)	chairman.ken@enron.com	dl-ga-all_enron_worldwide2@enron.com		Enron Files Chapter 11 Reorganization\n28378327.1075840036940.JavaMail.evans@thyme	Fri, 30 Nov 2001 12:09:39 -0800 (PST)	estrickland@mieco.com	mswerzb@enron.com		couple things\n1752967.1075840036795.JavaMail.evans@thyme	Sun, 2 Dec 2001 19:45:26 -0800 (PST)	chairman.ken@enron.com	dl-ga-all_enron_worldwide2@enron.com		Enron Files Chapter 11 Reorganization\n28378327.1075840036940.JavaMail.evans@thyme	Fri, 30 Nov 2001 12:09:39 -0800 (PST)	estrickland@mieco.com	mswerzb@enron.com		couple things\n1752967.1075840036795.JavaMail.evans@thyme	Sun, 2 Dec 2001 19:45:26 -0800 (PST)	chairman.ken@enron.com	dl-ga-all_enron_worldwide2@enron.com		Enron Files Chapter 11 Reorganization";
	
	//DATA NOT IN REQUEST
	//private static String request = "false,variableformatparsing\n\t,1,2\nc:\\CPinput.tab\nc:\\CPoutput.tab";	
	
	
	public static void main(String[] args) {
		run();
	}
	
	public static void run(){
		//HashMap<Integer, Long> conHashh = new HashMap<Integer, Long>();
		HashMap<Integer, Long> conHash = new HashMap<Integer, Long>();
		
		long time = 0;
		int i;
		long sum = 0;
		int counter = 0;
		DataInputStream input = null;
		Socket clientSocket = null;
		try{
			
			for(i=0;i<100;i++){
			clientSocket = new Socket();
			SocketAddress socketAddress = new InetSocketAddress("172.16.110.163", 8090);
			clientSocket.connect(socketAddress);
			input = new DataInputStream(clientSocket.getInputStream());
			
				
		
			PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), false);
			writer.println(i+request);
			time = System.currentTimeMillis();
			conHash.put(i, time);
			writer.flush();
			//System.out.println("SYN " + i);
			
		
			
			clientSocket.shutdownOutput();
			//while(true){
				
				BufferedReader reader = new BufferedReader(new InputStreamReader(input));
				String line;
				String res = reader.readLine();			
				String count = res.substring(0, 1);
				int c = Integer.parseInt(count);
				long t = conHash.get(c);
				time = System.currentTimeMillis() - t;
				sum += time;
				++counter;
				long avg = sum / counter;
				
				//System.out.println("Response : " +  res);
				//System.out.println("TIME : " + time + " ns");
				//while ((line = reader.readLine()) != null) {
				//	res += "/n" + line;
			//	}
				if(counter==100){
				System.out.println("AVERAGE TIME IS " + (sum/counter) + " ms");
				System.out.println();
				}
				clientSocket.shutdownInput();
				
				clientSocket.close();
				//}
			}
			
		
			
		}catch(Exception e){
			e.printStackTrace();
		}
	
	
}
}
