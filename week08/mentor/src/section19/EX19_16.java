package section19;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class EX19_16 {
	public static void main(String[] args) {

		FileInputStream in = null;
		InputStreamReader is = null;

		try {
			in = new FileInputStream("read.txt");
			is = new InputStreamReader(in, "UTF-8");
			int read = 0;
			while ((read = is.read()) != -1) {
				System.out.print((char) read);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (is != null) {
					is.close();
				}
				if (is != null) {
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}