package section19;

import java.io.BufferedReader;
import java.io.FileReader;

public class EX19_14 {
	public static void main(String[] args) {

		FileReader reader = null;
		BufferedReader br = null;

		try {
			reader = new FileReader("book.txt");
			br = new BufferedReader(reader);
			// 문장을 저장할 변수
			String str = "";
			// 버퍼에 문자를 저장하기 때문에 한번에 읽기 가능
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (br != null) {
					br.close();
				}
				if (reader != null) {
					reader.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}