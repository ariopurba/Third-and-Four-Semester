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
public class Ch12TestBufferedReader {
    public static void main (String[] args) throws IOException {

	//set up file and stream
	File inFile = new File("sample3.data");
	FileReader fileReader = new FileReader(inFile);
	BufferedReader bufReader = new BufferedReader(fileReader);
	String str;

	str = bufReader.readLine();
	int i = Integer.parseInt(str);

	//similar process for other data types

	bufReader.close();
    }

}
