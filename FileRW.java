import java.io.*;

  public class FileRW{
  private String name;
  private String mode;
  private StringBuffer text;
  private char buffer[];
  FileRW(String name,String mode)
  {
    this.name = name;
    this.mode = mode;
    if(mode == "r")
      text = new StringBuffer(100000);

  }
  public String fRead()
  {
    char ch;
    int x=0;
    try(FileReader fr = new FileReader(name))
    {
      while( (x=fr.read()) != -1)
        text.append((char)x);

      return text.toString();
    }
    catch(IOException e)
    {
      System.err.println("I/O Error!");
    }
    return " Parsing Not Possible";

	}

	public void fWrite(String textToWrite)
	{
	  
	  try(FileWriter fw = new FileWriter(name))
	  {
		for(int i=0;i < textToWrite.length();i++)
		  fw.write(textToWrite.charAt(i));
	  }
	  catch(IOException e)
	  {
		System.err.println("I/O Error!");
	  }
	}

}
