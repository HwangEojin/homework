package section19;

import java.io.FileWriter;

public class EX19_10 {
	public static void main(String[] args) {

		FileWriter w = null;
		try {
			// FileOutputStream처럼 이어쓰기, 덮어쓰기 모드 존재
			w = new FileWriter("fileText.txt", false);
			w.write('H');
			w.write('A');
			w.write('P');
			w.write('P');
			w.write('Y');
			w.write('\n');
			System.out.println("파일 생성 완료");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (w != null) {
					w.close();
				}
			} catch (Exception e) {
				e.printStackTrace();

			}
		}
	}
}