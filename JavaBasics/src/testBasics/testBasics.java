package testBasics;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class fileRW{

String line =  null;
public void readFile(String fileNnP) throws IOException{
	try {
		FileReader fr = new FileReader(fileNnP);
		BufferedReader br = new BufferedReader(fr);
		
		while((line=br.readLine())!=null){
			//read file content
			System.out.println(line);
		}
		br.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}	
public void writeFile(String fileNnP){
	try {
		FileWriter  fw = new FileWriter(fileNnP,true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("test");
		bw.newLine();
		bw.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}	

}//end of class

public class testBasics {

	public static void main(String[] args) throws IOException {
		System.out.println("Welcome to Java programming");
		
		String fileName="test.txt";
		String filePath="C://Users//ASK Computers//Desktop//Ajinath Doc//";
		String FileNL= filePath.concat(fileName);
		
		
		System.out.println(FileNL);
		fileRW  frw = new fileRW();
		
		frw.readFile(FileNL);
		frw.writeFile(FileNL);
		frw.readFile(FileNL);
	}

}
