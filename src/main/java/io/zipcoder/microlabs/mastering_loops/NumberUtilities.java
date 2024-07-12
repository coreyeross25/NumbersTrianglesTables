package io.zipcoder.microlabs.mastering_loops;


import static jdk.internal.org.jline.utils.Colors.s;

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
            StringBuilder squareNumber = new StringBuilder();

            for (int i = start; i < stop; i+=step) {
                squareNumber.append(Math.round(Math.pow(i, 2)));
            }

        return squareNumber.toString();
    }

    public static String getRange(int stop) {
        StringBuilder getRan = new StringBuilder();

        for (int i = 0; i < stop; i = i + 1){
            getRan.append(i);
        }
        return getRan.toString();
    }

    public static String getRange(int start, int stop) {
            StringBuilder getRange = new StringBuilder();
            for (int i = start; i < stop; i = i + 1){
                getRange.append(i);
            }

        return getRange.toString();
    }


    public static String getRange(int start, int stop, int step) {
            StringBuilder gr = new StringBuilder();

            for (int i = start; i < stop; i+=step) {
                gr.append(i);
            }
            return gr.toString();
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder expo = new StringBuilder();

        for ( int i = start; i < stop; i+=step) {
            expo.append(Math.round(Math.pow(i, exponent)));
        }

        return expo.toString();
    }
}
