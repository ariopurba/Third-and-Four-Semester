/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringManipulation;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Rafael Mahesa
 */
public class TokenTest {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence and press Enter : ");
        String sentence = scanner.nextLine();
        StringTokenizer tokens = new StringTokenizer(sentence, "[aeiou]");
        System.out.printf("Number of elements: %d\nThe tokens are:\n",
                tokens.countTokens());
        while (tokens.hasMoreTokens()) {
            System.out.println(tokens.nextToken());
        }
    }
}
