Que:1 Use text file write its content?
Ans:1
package acadviewdemo1;
import java.io.*;
public class CopyFile {
    public static void main(String []args){
 File f1=new File("C\\Users\\Harpreet Bains\\New_Folder\\skb.txt");
  File f2=new File("C\\Users\\Harpreet Bains\\New_Folder\\skb1.txt");
  FileReader in=new FileReader(f1);
  FileWriter out=new FileWriter(f2);
  int c;
  while((c=in.read())!=-1)
          {
              out.write(c);
          }
  in.close();
  out.close();
  FileReader input=new FileReader(f2);
  int d;
  while((d=input.read())!=-1)
  {
      System.out.print((char)d);
  }
  input.close();

    }
    
}

