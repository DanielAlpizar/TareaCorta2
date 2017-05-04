package thePackage;

import java.util.ArrayList;

public class TextLoader {
	
	private String text;
	private Interface inter;
	private TextSeparator ts;
	private Charger ch;
	private ArrayList<String> x;
	
	public String readText(String text){
		this.text = text;
		ts = new TextSeparator();
		System.out.println(ts.wordSeparator(this.text));
		return this.text;
		
	}

}
