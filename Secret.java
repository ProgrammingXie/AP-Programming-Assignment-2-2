import  java.util.Scanner; 

class Secret{
    public static void main(String[] args){
        Scanner Scan = new Scanner(System.in);
        String FirstSecret =  "";
        String SecondSecret = ""; 
        
        System.out.println("Guard1: Traveler, welcome to the Great City of Alima.");
        System.out.println("Guard2: Now if you wish to enter this holy place, you must speak the ancient words. They will grant you immunity against the power field in our city.");
        System.out.println("Guard1: If you don't, your mortal body cannot withstand the power field and will return to its natural state of atoms.");
        System.out.println("Guard1: wuoiqgjp qoijawe imtroep fwvopek (May you continue with wisdom).");
        System.out.println("Guard2: Now, what are the words?");
        System.out.println("");
        
        FirstSecret = Scan.nextLine();
        if ("Never gonna give you up".equals(FirstSecret)){
            System.out.println("");
            System.out.println("Guard1: What is the second part of the words?");
            SecondSecret = Scan.nextLine();
            if ("Never gonna let you down".equals(SecondSecret)){
                System.out.println("");
                System.out.println("Guard2: Good, you may enter now.");
                System.out.println("Guard1: we may now escort you to King Rick.");
            }
            else {
                System.out.println("");
                System.out.println("Guard1: I am sorry but we must reject your request to enter.");
                System.out.println("Guard2: You should make your exit now.");
            }
        }
        else {
            System.out.println("");
            System.out.println("Guard1: I am sorry, but you must not enter our holy city");
            System.out.println("Guard2: You may leave now");
        }
    }
}