package server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import requesthandler.RequestHandler;
import configuration.ServerConfiguration;
import constants.Delimiters;
import factory.BusinessLogicFactory;

public abstract class CustomServer {
	protected BusinessLogicFactory businessLogicFactory;
	protected ServerConfiguration conf = null;
	protected RequestHandler reqHandler;

	public CustomServer(){
		businessLogicFactory = new BusinessLogicFactory();
	}
	
	public void startServer() {

	}

	public void serveRequests() {

	}

	public void stopServer() {

	}

	protected RequestHandler createRequestHandler(){
		return reqHandler;
	}
}
