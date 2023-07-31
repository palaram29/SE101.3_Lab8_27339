
package com.mycompany.fileexception;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class FileException 
{

    public static void main(String[] args) 
    {
      try
       {
           File file = new File("a.text");
           
           Scanner s=new Scanner(file);
           
           while(s.hasNextLine())
           {
               String line= s.nextLine();
               System.out.println(line);
           }
           s.close();
       }
      catch (FileNotFoundException e)
               {
                   System.out.println("Error! File not found! "+e);
               } 
    }
}
