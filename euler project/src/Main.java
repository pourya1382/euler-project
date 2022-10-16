import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primeNumber = scanner.nextInt();
        int i = 1;
        int [] listPrimeNumber = new int[primeNumber];

        while(i == primeNumber){


            int x = 5;

            int [] mainPrime = new int[i];
            for(int y =0;y<i;y++){
                if(listPrimeNumber[y]!=0){
                    int z = 1;
                    mainPrime[z] = listPrimeNumber[y];
                    z++;
                }

            }
            if(x%2!=0){
                listPrimeNumber[i] =x ;
                x+=2;
            } else if (x% mainPrime[0]!=0) {
                listPrimeNumber[i] =x ;
                x+=2;
            }
            {

            }






        }
        System.out.println("your number: " + listPrimeNumber[primeNumber] );
    }

}


