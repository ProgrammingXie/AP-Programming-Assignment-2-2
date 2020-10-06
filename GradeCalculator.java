import java.util.Scanner;
import java.text.DecimalFormat;

class GradeCalculator{
    public static void main(String[] args){
       Scanner Scan = new Scanner(System.in);
       DecimalFormat df = new DecimalFormat("0.0");
       double FinalGrade = 0;
       double Overall = 0;
       double YourMark = 0;
        
       System.out.println("Welcome to the Grade Calculator where you can find out your marks 😀");
       System.out.println("By Ethan Xie");
       System.out.println("(don't worry, we wil round up your mark)");
       System.out.println("");
       
       
       System.out.println("Please provide the information on what the test is out of?");
       Overall = Scan.nextDouble();
       System.out.println("");
       
       if (Overall > 0){
          System.out.println("Now, what is the mark you got? (Don't be shy).");
          YourMark = Scan.nextDouble();
          System.out.println("");
          if (YourMark >= 0  && YourMark <= Overall){
              FinalGrade = Math.abs((YourMark/Overall)*100);
              
              System.out.println("Your mark is " + df.format(FinalGrade) + "%");
              if (FinalGrade >= 86){
                  System.out.println("Awesome job, you got an A, now you can play some video games.");
              }
              else if (FinalGrade >= 73){
                  System.out.println("That's a B, let's study harder and get a better mark next time.");
              } 
              else if (FinalGrade >= 67){
                  System.out.println("You got a C+, now lets work towards getting a B, shall we?");
              }
              else if (FinalGrade >= 60){
                  System.out.println("Believe it is a C, you passed but why not try getting a higher mark.");
              }
              else if (FinalGrade >= 50){
                  System.out.println("It is a C-, gotta stop playing those video games and looking at your phone all day.");
              }
              else if (FinalGrade >= 0){
                  System.out.println("F");
              }
              //System.out.println(FinalGrade);
          }
          else {
              System.out.println("");
              if (YourMark<0){
                  System.out.println("WHAT! Negative mark? How bad are you? 🙃");
              }
              else if (YourMark>Overall){
                  System.out.println("You must a genius, how did you get higher than 100%?");
              }
          }
       }
       else {
           System.out.println("");
           System.out.println("Get out of here, you troll.");
       }
    }
}