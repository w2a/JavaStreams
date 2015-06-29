import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ReadingFiles {

	/**add a new comment
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {


		//Connecting Streams
		
		File f = new File("C:\\filewriting\\myTextFile.txt");
		FileReader fr = new FileReader(f);
		BufferedReader reader = new BufferedReader(fr);
		
		//read text file
		String line = null;
		while((line = reader.readLine())!=null){
			
			
			System.out.println(line);
			
		}
		
		reader.close();
		

	}

}
