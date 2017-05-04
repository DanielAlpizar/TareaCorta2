package thePackage;

import java.util.ArrayList;

public class TextSeparator {
	
	private ArrayList<String> wordList = new ArrayList<String>();
	
	public ArrayList<String> wordSeparator(String text){
		
		String[] words = text.split(" ");
		
		for(String word : words){
			
			wordList.add(word);
			Thread thread = new Charger();
			thread.start();
			
		}	
		return wordList;
	}
}
