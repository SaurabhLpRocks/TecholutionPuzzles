package com.techolution.problmes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InTheFuture {
	public static void main(String[] args) {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(System.in));
			int a = Integer.parseInt(reader.readLine());
			int k = Integer.parseInt(reader.readLine());
			int p = Integer.parseInt(reader.readLine());

			int minNum = minNum(a, k, p);
			System.out.println(minNum);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static int minNum(int a, int k, int p) {

		int asha = a + p;
		int kelly = k;
		int noofDays = 1;

		if(a==k || a>k){
		 return -1;
		}
		else if (asha < kelly) {
			return 1;
		} else if (asha == kelly) {
			return 2;
		} else {
			while (true) {
				if (asha < kelly) {
					return noofDays;
				} else if (asha == kelly)
					return noofDays + 1;
				else {
					asha = asha + a;
					kelly = kelly + k;
					noofDays++;
				}
			}
		}
	}
}
