/** This program converts integer numbers
 * to their binary representation
 */

package com.company;
import java.util.Scanner;

public class Main {

    static String toBinary(int num){
        String temp = ""; //placeholder
        String binary= "";

        //convert number to binary
        while(num>0){
            temp += (num%2);
            num /= 2;
        }

        //store values in a char array
        char [] holdBin = temp.toCharArray();

        //Add char values to string binary in reverse
        for(int i = holdBin.length - 1; i>=0; i--){
            binary += i;
        }

        return binary;
    }

    public static void main(String[] args) {
        System.out.println("Convert any number to binary, Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(x + " in binary is " + toBinary(x));
    }
}
