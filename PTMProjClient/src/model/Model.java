package model;

import java.io.IOException;
import java.net.Socket;
import java.util.Observable;

import interpreter.*;
public class Model extends Observable{
	 
	
	public Model(){
		// TODO Auto-generated constructor stub
	}
	
	public void connect(String ip, String port) {
		try {
			System.out.println(port);
			System.out.println(Integer.parseInt(port));
			Socket socket=new Socket(ip, Integer.parseInt(port));
			System.out.println("connected to the server");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
//try
	public int Interpert(String[] arr) {
		Interperter interpeter = new Interperter();
		return interpeter.interpret(arr);
	}


		
	
}
