# JParser
Java Html Parser for extracting words within html tags.

#Current Status of the Project
JParser parses the html page by extracting all the word within <> </> tags.<br>
Currently html is read from file.

#Future Scope
Analysing the extracted words using Stemming Algorithm

#Libraries Developed During Project
<h3>FileRW.java</h3>

FileRW.java class implements File Input/Output operations allowing users to read and write files in just two line of code.

<h5>To Read:</h5>
FileRW   fObj = new   FileRW("fileName","r");<br>
String text = fObj.fread();

<h5>To Write:</h5>
FileRW   fObj = new   FileRW("fileName","w");<br>
fObj.write("String to write in file");
