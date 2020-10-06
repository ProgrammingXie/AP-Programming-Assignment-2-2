import java.util.Scanner;

class Magic8Ball {
    public static void main (String[] args){
        Scanner Scan = new Scanner(System.in);
        int answer = (int) (Math.random()*20) + 1;
        
        System.out.println("Welcome to the Magic Eight Ball Machine!");
        System.out.println("By Ethan Xie");
        System.out.println("You can ask any question you want BUT it must be a yes or no questions.");
        System.out.println("");
        
        Scan.nextLine();
        System.out.println("");
        
        if (answer == 1){
            System.out.println("Sorry what? I didn't hear the question.");
        }
        else if (answer == 2){
            System.out.println("Most likely yes.");
        }
        else if (answer == 3){
            System.out.println("Most likely NOT.");
        }
        else if (answer == 4){
            System.out.println("How about no.");
        }
        else if (answer == 5){
            System.out.println("That's an yes, without doubt.");
        }
        else if (answer == 6){
            System.out.println("I'm  afraid not.");
        }
        else if (answer == 7){
            System.out.println("YEAAAAAAA, definitely.");
        }
        else if (answer == 8){
            System.out.println("Be more specific.");
        }
        else if (answer == 9){
            System.out.println("It is for certain.");
        }
        else if (answer == 10){
            System.out.println("Come back in 5 minutes and ask again.");
        }
        else if (answer == 11){
            System.out.println("Most definitely no.");
        }
        else if (answer == 12){
            System.out.println("Siri said yes. :)");
        }
        else if (answer == 13){
            System.out.println("Siri said no. :(");
        }
        else if (answer == 14){
            System.out.println("There is absolutely no way.");
        }   
        else if (answer == 15){
            System.out.println("Maybe Doctor Strange would know? Oh, he said yes.");
        }
        else if (answer == 16){
            System.out.println("Yeap....... :|");
        }
        else if (answer == 17){
            System.out.println("Nani? well that is a no then.");
        }
        else if (answer == 18){
            System.out.println("There is stil a chance.");
        }
        else if (answer == 19){
            System.out.println("System failure, please try again.");
        }
        else if (answer == 20){
            System.out.println("That's a no brainer, NO way.");
        }   
    }
}