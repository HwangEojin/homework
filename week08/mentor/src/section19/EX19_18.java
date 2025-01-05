package section19;

import java.io.File;

public class EX19_18 {
	public static void main(String[] args) {

		File f = new File("./example.txt");
		if (f.exists()) { //파일이 존재할 명우

			System.out.println("length : " + f.length());
			System.out.println("canRead : " + f.canRead());
			System.out.println("canWrite : " + f.canWrite());
			System.out.println("getAbsolutePath : " + f.getAbsolutePath());

			System.out.println("getName : " + f.getName());
			System.out.println("getParent : " + f.getParent());
			System.out.println("getPath : " + f.getPath());
		} else { //파일이 존재하기 않을 경우
			System.out.println("파일이 존재하지 않습니다");
		}
	}
}