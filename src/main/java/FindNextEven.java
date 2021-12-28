import java.util.Scanner;
public class FindNextEven {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a value");
        long input = sc.nextLong();
//        lambda expression that will return an even value
          NextEven nextEven =(long num)->num+2-(num%2);
          long even=nextEven.findEven(input);
        System.out.println("Entered value:"+input+"\nNext even: "+even);
    }
}
