package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {

    public static String getEvenNumbers(int start, int stop) {
      StringBuilder evenNumbers = new StringBuilder();
      for (int i = start; i < stop; i ++ ) {
          if (i % 2 == 0) {
              evenNumbers.append(i);
          }
      }   return evenNumbers.toString();
    }

    public static String getOddNumbers(int start, int stop) {
            StringBuilder oddNumbers = new StringBuilder();
            for (int i = start; i < stop; i ++ ) {

                if (i % 2 != 0) {
                    oddNumbers.append(i);
                }
            }    return oddNumbers.toString();
    }


    public static String getSquareNumbers(int start, int stop, int step) {

        getExponentiations(start, stop, step, 2);
    }
    // should be stop
    // changed from start to stop
    public static String getRange(int stop) {

        //return getExponentiations(0, stop, 1, 1 );;
        String s = "";
        for (int i = 0; i < stop; i = i + 1){
            s = s + integer.toSring(i);
        }
        return s;
    }

    public static String getRange(int start, int stop) {

        return getExponentiations(start, stop, 1, 1 );;
    }


    public static String getRange(int start, int stop, int step) {
        return getExponentiations(start, stop, step, 1 );
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        return null;
    }
}
