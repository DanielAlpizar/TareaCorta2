package thePackage;

import java.util.Hashtable;
import java.util.ArrayList;

public class SystemMemory {

	private Hashtable< String, String > memory;
	private String Url;
	
	public SystemMemory(){
		
		memory = new Hashtable< String, String >();
		Url = "http://www.google.com/search?q=";
		
	}
	
	public boolean wordMemory(ArrayList<String> wordList){
		
		for(int position = 0; position < wordList.size(); position++ ){
			
			String wordKey = wordList.get(position);
			if(memory.containsKey(wordKey)){
				
				return false;
				
			}else{
				
				Url.concat(wordKey);
				memory.put(wordKey, Url);
				return true;
			}
		}
		return false;
	}
}
