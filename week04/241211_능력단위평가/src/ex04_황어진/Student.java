package ex04_황어진;

public class Student extends Person {
	/*
	 * logic
	 * 
	 * private 타입으로 필드 선언
	 * 
	 * private 값에 접근하기 위해 getter setter 사용
	 * 
	 * 총합을 구하는 메소드 와 평균을 구하는 메소드 생성
	 * 
	 */
	private int javaScore;
	private int dbmsScore;
	private int htmlScore;

	public Student(String name) {
		super(name);
	}

	int getTotalScore() {
		return this.javaScore + this.dbmsScore + this.htmlScore;

	}

	int getAverageScore() {

		return (this.javaScore + this.dbmsScore + this.htmlScore) / 3;

	}

	public int getJavaScore() {
		return javaScore;
	}

	public void setJavaScore(int javaScore) {
		if (javaScore > 100 || javaScore < 0) {
			System.out.println("잘못된 값을 입력하셨습니다.");
			return;
		}
		this.javaScore = javaScore;
	}

	public int getDbmsScore() {
		return dbmsScore;
	}

	public void setDbmsScore(int dbmsScore) {
		if (dbmsScore > 100 || dbmsScore < 0) {
			System.out.println("잘못된 값을 입력하셨습니다.");
			return;
		}
		this.dbmsScore = dbmsScore;
	}

	public int getHtmlScore() {
		
		return htmlScore;
	}

	public void setHtmlScore(int htmlScore) {
		if (htmlScore > 100 || htmlScore < 0) {
			System.out.println("잘못된 값을 입력하셨습니다.");
			return;
		}
		this.htmlScore = htmlScore;
	}

}
