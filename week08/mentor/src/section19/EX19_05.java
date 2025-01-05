package section19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EX19_05 {
	public static void main(String[] args) {
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream("back.jpg");
			out = new FileOutputStream("back_copy.jpg");
			// 현재 시간을 m/s 단위로 나타냄
			long start = System.currentTimeMillis();
			System.out.println("이미지 읽기 시작");
			int read = 0;
			while ((read = in.read()) != -1) {
				out.write(read);
			}
			System.out.println("이미지 읽기 종료");
			long end = System.currentTimeMillis();
			long time = (end - start) / 1000;
			System.out.println(time + "초");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}