import java.io.*;

class createfile
{

 public static void main(String []args)
 {

 try
 {

  File f=new File("D://Java//java basics//samplefile.txt");
  FileWriter fw=new FileWriter(f);

  char letter1='a';
  fw.write(letter1);
  fw.close();

  FileReader fr=new FileReader(f);
  char result = (char)fr.read();
   
  System.out.println(" output letter is " + result);
  fr.close();
  
 }
 catch(IOException ex)
  {

   }
  }
}