import java.io.*;
public class ParsingDemo{
  public static void main(String[] args)throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String fileName;
    String htmlRawText;
    String parsedText;
    String[] parsedTextList;

    //User Input
    System.out.println("Enter File Name : ");
    fileName = br.readLine();

    //Read File
    FileRW fr = new FileRW(fileName,"r");
    htmlRawText = fr.fRead();

    //Parsing htmlRawText
    JParser jp = new JParser(htmlRawText);
    parsedText = jp.getString();

    //Writing to files

    FileRW fw=new FileRW("Result.txt","w");
    fw.fWrite(parsedText);
    //System.out.println(parsedText);

    //display in list form
    parsedTextList = jp.getListString();
    System.out.println(" Displaying all the words stored in an array ");
    for(String x : parsedTextList)
      {
        System.out.print(x+" ");
      }
      System.out.println();

  }
}
