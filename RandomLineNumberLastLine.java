import java.util.*;
import java.io.*;
class Main{
  public static void main(String[] args)throws Exception{
    Random rn = new Random();
    int max = 9;
    int min = 0;
    int randomNumber = rn.nextInt(max - min + 1) + min;
    System.out.println("Random Number: "+randomNumber);
    int last = randomNumber + 10;

    String fname = "questions.txt";
    FileReader fr = new FileReader(fname);
    BufferedReader br1 = new BufferedReader(fr);
    String s = "x";
    for(int i = min; s!=null; i++){
        if(i >= randomNumber){
          s = br1.readLine();
          System.out.println(s);
        }
        else {
          s=br1.readLine();
        }
      }
		br1.close();
  }
}
