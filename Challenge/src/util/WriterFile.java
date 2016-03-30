package util;

import java.io.File;
import java.nio.file.Files;

public class WriterFile {

	public void writerFile() throws Exception {
		CatchDataFiles catchFiles = new CatchDataFiles();

		String fileContent = catchFiles.CatchContentFile();
		String localSave = (System.getProperty("user.home") + File.separator + "data" + File.separator + "out\\");
		Files.write(new File(localSave + "flat_file_name" + ".done.dat").toPath(), fileContent.getBytes());

		// FileWriter arquivo;
		// try {
		// arquivo = new FileWriter(new File(localSave + "flat_file_name" +
		// ".done.dat"));
		// arquivo.write(fileContent);
		// arquivo.close();
		// } catch (IOException e) {
		// e.printStackTrace();
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
	}
}
