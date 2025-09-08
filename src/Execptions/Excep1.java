package Execptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class Excep1{
public static void main (String[] args)  {
try{
    FileInputStream fis=new FileInputStream("D:/");
}
      catch (Exception e){
          System.out.println(e);
          e.printStackTrace();
//          System.out.println(e.getMessage());
//          System.out.println(e.toString());
      }

    System.out.println("Hello");


}
}