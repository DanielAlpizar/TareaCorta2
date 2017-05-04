package thePackage;

import java.lang.Thread;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import javax.net.ssl.HttpsURLConnection;


public class Charger extends Thread {
	
	private String Name;
	private SystemMemory systemMemory;
	private TextSeparator textSeparator;
	private TextLoader textLoader;
	

	public Charger(){
		
		textLoader = new TextLoader();
		textSeparator = new TextSeparator();
		systemMemory = new SystemMemory();
		
	}
	
	public void runSearch(String text) throws IOException{
		
		String urlLink = "http://www.google.com/search?q="+text;
		URL url = new URL(urlLink);
		HttpsURLConnection connection = (HttpsURLConnection)url.openConnection();
		connection.setRequestMethod("GET");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		StringBuffer buffer = new StringBuffer();
		String line;
		
		while((line = in.readLine()) != null){
			buffer.append(line);
		}
		in.close();
		System.out.println(buffer.toString());
	}
	
}
