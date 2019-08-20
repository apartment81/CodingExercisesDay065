package ro.mirodone;

public class SumDigits {

    int getSum( int number) {

        int sum = 0;
        int n;

        while (number != 0) {

          //  sum = sum + number % 10;
         //   number = number/10;

            n = number % 10;
            sum = sum + n;
            number = number / 10;

        }

        return sum;
    }

}
