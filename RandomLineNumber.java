import java.util.*;
import java.io.*;
class Main{
  public static void main(String[] args)throws Exception{
    Random rn = new Random();
    int max = 9;
    int min = 0;
    int randomNumber = rn.nextInt(max - min + 1) + min;
    System.out.println(randomNumber);


    String fname = "questions.txt";
    FileReader fr = new FileReader(fname);
    BufferedReader br1 = new BufferedReader(fr);
    String s = "";
    if(randomNumber != min){
      for(int i = min; i < randomNumber; i++){
        System.out.println(i);
        s = br1.readLine(); //
        System.out.println(s); //Erase this line to skip all the lines until randomNumber line
      }
    }

    int last = randomNumber + 9;
    System.out.println("Starting real loop");
    for(int i = randomNumber; i < last; i++){
      System.out.println(i);
      s = br1.readLine();
      System.out.println(s);
    }
		br1.close();
  }

}
