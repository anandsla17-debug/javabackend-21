package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
public static void main(String[] args)  throws IOException{
	
	File  create= new File("C:\\Users\\Trainers\\Desktop\\hello.txt");
	
	if(create.createNewFile()) { // true/false
		System.out.println("file is created");
	}else {
		System.out.println("file is already created");
	}
	
	FileWriter writes=new FileWriter("hello.txt");
	writes.write("hello guys all");
	writes.close();
	
	FileReader read= new FileReader("hello.txt");
	
//	String data=read.readAllAsString();

//	System.out.println(data);
	
	int info;
while((info=read.read())!=-1) {
	System.out.print((char) info);
	System.out.print(info);
}
	System.out.println();
	read.close();
	
String data	=Files.readString(Path.of("hello.txt"));
System.out.println(data);
	
//	create.delete();

}
}
