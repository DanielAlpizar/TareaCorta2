package thePackage;

public class Word {
	
	private String Name;
	private String Url;
	
	public Word(String Name, String Url){
		this.Name = Name;
		this.Url = Url;
	}
	
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}

	public String getUrl() {
		return Url;
	}


	public void setUrl(String url) {
		Url = url;
	}
	
	
}