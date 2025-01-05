package section19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class EX19_15 {
	public static void main(String[] args) {
		FileReader reader = null;
		BufferedReader br = null;
		FileWriter writer = null;
		BufferedWriter bw = null;

		try {
			reader = new FileReader("book.txt");
			writer = new FileWriter("book_copy.txt", false);
			br = new BufferedReader(reader);
			bw = new BufferedWriter(writer);
			// 문장을 저장할 변수
			String str = "";
			System.out.println("텍스트 파일 복사 시작");
			// reader를 통해 읽어 온 문장을 새로운 파일에 씁니다.
			while ((str = br.readLine()) != null) {
				bw.write(str + "\n");
			}
			System.out.println("텍스트 파일 복사 완료");
		} catch (Exception e) {
		} finally {
		}
		try {
			if (bw != null) {
				bw.close();
			}

			if (writer != null) {
				writer.close();
			}

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
