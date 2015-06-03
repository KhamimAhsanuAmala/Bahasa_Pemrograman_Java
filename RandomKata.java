import java.util.*;
import java.io.*;

public class RandomKata
{
	
	public static void main (String [] khamimahsanu) throws IOException
	{	
		Random r = new Random();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String [] kata = {
							"JAVA",
							"WHILE",
							"METHOD",
							"INT",
							"STRING",
							"FOR",
							"DOUBLE",
							"FLOAT",
							"SCANNER",
							"BUFEREDREADER"
							"LONG"
							"FLOAT"
							"BUFFEREDREADER"
						 };
		String random = (kata[new Random().nextInt(kata.length)]);
		int idx = new Random().nextInt(kata.length);
		String random = (kata[idx]);
		System.out.print ("Apa arti kata ini\t: "+ kata);
		
	}
}
