package java_basics;

import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;

public class File_loop {
	public static void main(String[] args) throws IOException {
		
		Path path = Path.of("d://temp//files");
		Path newDir = Files.createDirectory(path.getParent().resolve("files"));
		
		for (int i = 0; i <= 10; i++) {
			Path newFile = Files.createFile(newDir.resolve("file" + i + ".txt"));
			System.out.println("new file = " + newFile);
			Files.writeString(newFile, "File " + i + " created.");
			String text = Files.readString(newFile);
			System.out.println(text);
		}
	}
}
