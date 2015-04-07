import java.io.*;
import java.util.ArrayList;

public class test {

    public static void main(String[] args) {
       System.out.println("Reading File from Java code");
       //Name of the file
       String fileName="irsample.txt";
	   ArrayList<String> contents = new ArrayList<String>();
       try{

          //Create object of FileReader
          FileReader inputFile = new FileReader(fileName);

          //Instantiate the BufferedReader Class
          BufferedReader bufferReader = new BufferedReader(inputFile);

          //Variable to hold the one line data
          String line;

          // Read file line by line and print on the console
          while ((line = bufferReader.readLine()) != null)   {
            contents.add(line);
          }
          System.out.println(contents.size());
          //Close the buffer reader
          bufferReader.close();
       }catch(Exception e){
          System.out.println("Error while reading file line by line:" + e.getMessage());                      
       }
       RegisterAllocate R1 = new RegisterAllocate(contents);
     }

}
