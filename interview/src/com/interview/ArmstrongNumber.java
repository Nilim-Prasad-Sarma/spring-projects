package com.interview;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int no = 153;
		int temp = no;
		int length = 0;

		while (temp != 0) {
			length = length + 1;
			temp = temp / 10;
		}

		int temp2 = no;
		int remainder = 0;
		int finalNo = 0;

		while (temp2 != 0) {
			remainder = temp2 % 10;
			int cube = 1;
			for (int i = 1; i <= length; i++) {
				cube = cube * remainder;
			}
			finalNo = finalNo + cube;
			temp2 = temp2 / 10;
		}
		
		if(no == finalNo) {
			System.out.println(no + " is an armstrong number");
		}else {
			System.out.println(no + " is not an armstrong number");
		}

	}
}
