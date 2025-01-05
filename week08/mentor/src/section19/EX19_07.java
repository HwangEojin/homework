package section19;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;

public class EX19_07 {
	public static void main(String[] args) {
		// 파일을 읽어올 변수
		int read = 0;
		// 스트림 선언
		InputStream in = null;

		try {
			in = new FileInputStream("file_korean.txt");
			while (true) {
				// 파일 읽기
				read = in.read();

				// -1 이면 종료
				if (read == -1) {
					break;
				}
				System.out.print((char) read);
			}
		} catch (IOException e) {
			System.out.println("Error :" + e.getMessage());
		} finally {

			try {
				// 객체가 사용 중이면 닫는다.
				if (in != null) {
					in.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
