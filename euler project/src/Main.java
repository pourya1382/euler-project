import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primeNumber = scanner.nextInt();
        ArrayList <Integer> primeNumbers= new ArrayList<Integer>();
        int prime=3;


        while (primeNumbers.size() == primeNumber){
            for(int i=0 ; i == primeNumbers.size(); i++) {
                int result = prime / primeNumbers.get(i);
                if(result == 0){
                    primeNumbers.remove(result);
                    continue;
                } else{
                    primeNumbers.add(result);
                }



                }
                prime +=2;
                }


        System.out.println(prime);

    }



}






