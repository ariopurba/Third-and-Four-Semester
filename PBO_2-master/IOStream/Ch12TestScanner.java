/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOStream;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Rafael Mahesa
 */
public class Ch12TestScanner {
    public static void main (String[] args) throws IOException {

	//open the Scanner
	Scanner scanner = new Scanner(new File("sample3.data"));

	//get integer
	int i = scanner.nextInt();

	//similar process for other data types

	scanner.close();
    }

}
