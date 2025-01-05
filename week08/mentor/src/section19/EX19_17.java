package section19;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class EX19_17 {
	public static void main(String[] args) {
		FileOutputStream in = null;
		OutputStreamWriter is = null;

		try {
			in = new FileOutputStream("example.txt");
			is = new OutputStreamWriter(in, "UTF-8");
			System.out.println("파일 생성 시작");
			String[] strArray = { "OutputStreamWriter에 대해 배웁니다.", "we are learning about OutputStreamWriter" };
			for (String str : strArray) {
				is.write(str + "\n");
			}
			System.out.println("파일 생성 완료");
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