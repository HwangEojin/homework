package wrapperTest;

public class WrapperTest01 {
	public static void main(String[] args) {

		int num1 = 10;
		System.out.println(num1);

		Integer iNum = Integer.valueOf(num1);
		System.out.println(iNum);

		// wrapper 클래스
		int unNum1 = iNum.intValue();
		System.out.println(unNum1);

		// 자동 박싱(AutoBoxing)
		double num2 = 1.1;
		Double dnum = num2;
		System.out.println(dnum);
		
		// 자동 언박싱(AutoUnboxing)
		double unNum2 = dnum;
		System.out.println(unNum2);
	}

}
