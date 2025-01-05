package section19;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class EX19_04 {
	public static void main(String[] args) {

		OutputStream out = null;
		try {
			out = new FileOutputStream("write_array.txt", false);
			String str = "Hello World";
			
			//문장을 바이트 배열로 변환하여 반환
			byte[] strArray = str.getBytes();
			out.write(strArray);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 객체가 사용 중이라면 닫는다.
				if (out != null) {
					out.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}
}
