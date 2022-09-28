/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOStream;

import java.io.*;

/**
 *
 * @author Rafael Mahesa
 */
public class Ch12TestPrintWriter {
    public static void main (String[] args) throws IOException {

	//set up file and stream
	File outFile = new File("sample3.data");
	FileOutputStream outFileStream 
			= new FileOutputStream(outFile);
	PrintWriter outStream = new PrintWriter(outFileStream);

	//write values of primitive data types to the stream
	outStream.println(987654321);
	outStream.println("Hello, world.");
	outStream.println(true);

	//output done, so close the stream
	outStream.close();

    }
}
