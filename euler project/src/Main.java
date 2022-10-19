import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("enter prime number index :");
        Scanner scanner = new Scanner(System.in);
        int primeNumber = scanner.nextInt();
        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
        primeNumbers.add(2);
        int prime = 3;
//        int halfPrimeNumber = primeNumber / 2;
//        for (int i = 0; i < halfPrimeNumber + primeNumber; i++) {
//            int result = primeNumber % halfPrimeNumber;
//            if (result == 0) {
//                System.out.println("this isn't prime number");
//                break;
//            } else {
//                halfPrimeNumber -= 1;
//                if (halfPrimeNumber == 1) {
//                    System.out.println("this  is prime number");
//                    break;
//                }
//            }
//
//
//        }


        while (primeNumbers.size() != primeNumber) {
//            System.out.println("primeNumbers.size(): " + primeNumbers.size());
            primeNumbers.add(prime);
            for (int i = 1; i < primeNumbers.size(); i++) {
//                System.out.println("i:" + i);
                int z = i-1;
                int result = prime % primeNumbers.get(z);
//                System.out.println("result :" + result);
                if (result == 0) {

                    if (primeNumbers.contains(prime)) {
                        int index = primeNumbers.indexOf(prime);
                        primeNumbers.remove(index);
                        break;

                    }
                    break;
                }


            }

//            System.out.println("prime:" + prime);
            prime += 2;
//            System.out.println(primeNumbers);
        }
        System.out.println(primeNumbers.get(primeNumbers.size()-1));
    }
}














