package util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReaderNameFiles {

	public List<File> readerFiles() throws IOException {
		List<File> filesList = new ArrayList<>();
		String fileDirectory = System.getProperty("user.home");
		File folder = new File(fileDirectory + File.separator + "data" + File.separator + "in");
		for (File file : folder.listFiles()) {
			if (file.getName().endsWith(".dat")) {
				filesList.add(file);
			}
		}
		return filesList;
	}
}
