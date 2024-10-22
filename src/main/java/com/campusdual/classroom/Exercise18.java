package com.campusdual.classroom;

public class Exercise18 {

	public static int [] createAndInitializeArray (int num){
		int [] array = new int[num];
		for (int i = 0; i < num; i++){
			array[i] = i+1;
		}
		return array;
	}

	public static void showInlineArray (int[] array) {
		if (array.length == 0) {
			System.out.println();
			return;
		}

		System.out.print(array[0]);

		for (int i = 1; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}
	}


	public static void main(String[] args) {
		int[] myArray = createAndInitializeArray(10);
		showInlineArray(myArray);

	}
}
