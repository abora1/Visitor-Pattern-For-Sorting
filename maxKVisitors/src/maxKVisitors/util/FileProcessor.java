package maxKVisitors.util;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import maxKVisitors.util.Logger;
import maxKVisitors.util.Logger.DebugLevel;

/**
 * @author akshay This class handles the processing of the input file along with
 *         exceptions occuring during file handling.
 */
public class FileProcessor {
	public FileProcessor() {
	}

	private BufferedReader br = null;

	public FileProcessor(String input) {
		try {
			File f = new File(input);
			if (!f.exists() && !f.isDirectory()) {
				System.out.println("THE GIVEN FILE DOES NOT EXISTS");
				Logger.writeMessage("THE GIVEN INPUT FILE IS INVALID",
						DebugLevel.FILE_PROCESSOR);
				System.exit(0);
			}
			if (!f.getName().endsWith(".txt")) {
				System.err
						.println("(.txt) formats are only supported for input file");
				System.exit(0);
			}
			br = new BufferedReader(new FileReader(f));
			Logger.writeMessage("New File has Been Accepted\n",
					DebugLevel.FILE_PROCESSOR);

		} catch (IOException e) {
			Logger.writeMessage("NO INPUT FILE FOUND",
					DebugLevel.FILE_PROCESSOR);
			e.printStackTrace();
			System.exit(0);
		}

	}

	// this method returns a single line from the file to user.
	public String readline() {
		try {
			String s = null;
			while ((s = br.readLine()) != null) {
				return s;
			}
		} catch (IOException e) {
			Logger.writeMessage("INPUT FILE CANNOT BE FETCHED",
					DebugLevel.FILE_PROCESSOR);
			e.printStackTrace();
			System.exit(0);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
		return null;
	}

	// This method returns an Integer from the file.
	public int nextInt() {
		try {
			String s = null;
			while ((s = br.readLine()) != null) {
				int x = Integer.parseInt(s);
				return x;
			}
		} catch (NumberFormatException e) {
			Logger.writeMessage("CONVERSION FROM STRING TO INT FAILED",
					DebugLevel.FILE_PROCESSOR);
			e.printStackTrace();
			System.exit(0);
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
		return 0;
	}

	// closes the file when completes execution.
	public void fileclose() {
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
