package section19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EX19_13 {
	public static void main(String[] args) {
		FileInputStream readFile = null; // 기반 스트림
		BufferedInputStream bis = null; //보조 스트림

		FileOutputStream writeFile = null; // 기반 스트림
		BufferedOutputStream bos = null; //보조 스트림

		try {
			System.out.println("기본 스트림으로 복사 시작");
			readFile = new FileInputStream("back.jpg");
			writeFile = new FileOutputStream("copy.jpg");
			// 데이터 읽을 변수
			int read = 0;
			// 현재 시간을 m/s 단위로 나타냄
			long start = System.currentTimeMillis();
			System.out.println("이미지 복사 시작!");
			while ((read = readFile.read()) != -1) {
				//이미지 쓰기
				writeFile.write(read);
			}
			System.out.println("이미지 복사 종료1");
			long end = System.currentTimeMillis();
			long time = (end - start) / 1000;
			System.out.println("소요 시간 : " + time + "초");
			System.out.println("기본 스트림으로 복사 종료");
			// 파일 닫기
			readFile.close();

			writeFile.close();
			System.out.println("보조 스트림으로 복사 시작");
			readFile = new FileInputStream("back.jpg");
			writeFile = new FileOutputStream("copy.jpg");
			bis = new BufferedInputStream(readFile);
			bos = new BufferedOutputStream(writeFile);
			// 현재 시간을 m/s 단위로 나타냄
			start = System.currentTimeMillis();
			System.out.println("이미지 복사 시작2");
			while (bis.read() != -1) {
				//이미지 쓰기
				bos.write(read);
			}
			System.out.println("이미지 복사 종료2");
			end = System.currentTimeMillis();
			double result = (double) (end - start) / 1000;
			System.out.println("소요 시간 : " + result + "초");
			System.out.println("보조 스트림으로 복사 종료");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bis != null) {
					bis.close();
				}
				if (readFile != null) {
					readFile.close();
				}
				if (bos != null) {
					bis.close();
				}
				if (writeFile != null) {
					writeFile.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}