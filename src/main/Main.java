package main;

import java.net.ServerSocket;
import java.net.Socket;

import configuration.ServerConfiguration;
import constants.Delimiters;
import constants.ReadWrite;
import constants.ThreadPools;
import factory.ServerFactory;
import server.CustomServer;


public class Main {
	
	public static void main(String[] args) {
		
		ServerConfiguration conf = setAndGetServerConfiguration(args);
		
		int NPROCS = Runtime.getRuntime().availableProcessors();
		
		ServerFactory serverFactory = new ServerFactory(conf);
		
		CustomServer server = serverFactory.getServerInstance();
		
		server.startServer();
		
		server.serveRequests();
			
	}
	
	private static ServerConfiguration setAndGetServerConfiguration(String[] args){
		String[] serverConfParamCSV = args[0].split(Delimiters.FIELD_DELIMITER);
		if(args.length >= 2)
			ReadWrite.DATA_QUANTUM = Integer.parseInt(args[1]);
		if(args.length >= 3)
		ReadWrite.QUEUE_SIZE = Integer.parseInt(args[2]);
		return new ServerConfiguration(serverConfParamCSV);
	}
	
}
