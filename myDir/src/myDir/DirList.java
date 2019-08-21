package myDir;

import java.io.*;
import java.nio.file.*;
//import java.nio.file.Files;
//import java.nio.file.InvalidPathException;
//import java.nio.file.NotDirectoryException;
//import java.nio.file.Path;
//import java.nio.file.Paths;
import java.nio.file.attribute.*;

public class DirList {

	public static void main(String[] args) {
		
		String dirname ="//MyDir";
		try(DirectoryStream<Path> distrm=Files.newDirectoryStream(Paths.get(dirname)))
		{
			System.out.println("Directory of" +dirname);
			

			
			for(Path entry:distrm) {
				BasicFileAttributes attribs = FilesreadAttributes(entry, BasicFileAttributes.class);
				if(attribs.isDirectory())
					System.out.println("<DIR>");
				else
					System.out.println("   ");
				
				System.out.println(entry.getName(1));
			}
		}
		catch(InvalidPathException e) {
			System.out.println("path error" +e);
		}catch(NotDirectoryException e) {
			System.out.println(dirname +"is not a directory");
		}catch(IOException e) {
			System.out.println("I/O error" +e);
		}
		

	}

	private static BasicFileAttributes FilesreadAttributes(Path entry, Class<BasicFileAttributes> class1) {
		// TODO Auto-generated method stub
		return null;
	}

}
