import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

    String girText1 = "Enter The First Number: ";
    String girText2 = "Enter The Second Number: ";
        Scanner Ulas = new Scanner(System.in);

        while(true) {

        System.out.println("Frixxions Simple Calculator ~~~");
        System.out.println("Choose The Operation");
        System.out.println("[0] Exit");
        System.out.println("[1] +");
        System.out.println("[2] -");
        System.out.println("[3] x");
        System.out.println("[4] ÷");
        System.out.print("Enter Number: ");
       

        int Sec = Ulas.nextInt();
        if(Sec == 1) {
            System.out.print(girText1);
            int tGir1 = Ulas.nextInt();
            System.out.print(girText2);
            int tGir2 = Ulas.nextInt();
            int T = tGir1 + tGir2;
            System.out.println("Answer: " + T);
            
        }
        else if(Sec == 2){
            System.out.print(girText1);
            int ckGir1 = Ulas.nextInt();
            System.out.print(girText2);
            int ckGir2 = Ulas.nextInt();
            int CK = ckGir1 - ckGir2;
            System.out.println("Answer: " + CK);

            

        }

        else if(Sec == 3) {
            System.out.print(girText1);
            int crGir1 = Ulas.nextInt();
            System.out.print(girText2);
            int crGir2= Ulas.nextInt();
            int CR = crGir1 * crGir2;
            System.out.println("Answer: " + CR);
            

        }
        else if(Sec == 4) {
        System.out.print(girText1);
        int blGir1 = Ulas.nextInt();
        System.out.print(girText2);
        int blGir2 = Ulas.nextInt();
        double BL = blGir1 / blGir2;
 
        System.out.println("Answer: " + BL);

        
       }
       else if(Sec == 0) {
        break;
       }
    }
    }
}
