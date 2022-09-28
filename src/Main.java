import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter number to generate that many prime numbers");
        int n = s.nextInt();
        generatePrimeNumbers(n);
    }

    public static int[] generatePrimeNumbers(int n){
        int res[] = new int[n];
        long sum = 0; int no = 1, count=0;

        while(count<n){

            int k=0;
            for(int i=2; i<=no/2; i++){
                if(no%i == 0){
                    k=1; break;
                }
            }
            if(k==0){
                res[count] = no;
                count++; sum = sum + no;
                System.out.print(no + " ");
            }
            no++;
        }

        System.out.println("\n" + "Sum of total prime numbers generated = " + sum);
        return res;
    }
}