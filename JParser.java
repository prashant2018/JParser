import java.util.regex.*;
import java.io.*;
class JParser{

	private Pattern patWhole,patWord;
	private Matcher matWhole,matWord;
	private String htmlText;
  	private String text;
  	private String word;

	JParser(String text)
	{
		this.text = text;
		patWhole = Pattern.compile("<.+?>");
   		patWord = Pattern.compile("\\s+[?,.+()*/\\()_+-]+");
    	matWhole = patWhole.matcher(text);
		this.text = matWhole.replaceAll("");
		this.text = this.text.replaceAll("\\s+"," ");
		matWord = patWord.matcher(this.text);
		word = matWord.replaceAll("");
		word = word.replaceAll("\\s+"," ");
		
	}
	String getString()
	{
    	text=word.substring(1);
		return text;
	}

  String[] getListString()
  {
    	word = word.substring(1);
    	String[] listString = word.split("[\\s+]");
		return listString;
  }

}
