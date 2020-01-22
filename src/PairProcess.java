import java.util.Scanner;

public class PairProcess {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //get numbers
        System.out.print("First number? : ");
        int num1 = keyboard.nextInt();

        System.out.print("Second number? : ");
        int num2 = keyboard.nextInt();

        //sum
        int sum = num1 + num2;

        if(sum<1000 && sum>200){
            System.out.println("sum: " + sum + "~*");
        }
        else if(sum<1000){
            System.out.println("sum: " + sum + "~");
        }
        else if(sum>200){
            System.out.println("sum: " + sum + "*");
        }
        else{
            System.out.println("sum: " + sum);
        }

        //product
        int product = num1 * num2;
        System.out.println("product: " + product);

        //average
        int average = (num1 + num2)/2;
        System.out.println("average: " + average);

    }

}