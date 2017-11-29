package com.techo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BalancedOrNot {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int numberOfExpression = Integer.parseInt(reader.readLine());
		String expressions[] = new String[numberOfExpression];

		for (int i = 0; i < numberOfExpression; i++) {
			expressions[i] = reader.readLine();
		}
		numberOfExpression = Integer.parseInt(reader.readLine());

		int maxReplacements[] = new int[numberOfExpression];
		for (int i = 0; i < numberOfExpression; i++) {
			maxReplacements[i] = Integer.parseInt(reader.readLine());
		}

		int result[] = balancedOrNot(expressions, maxReplacements);
		for (int i : result)
			System.out.println(i);
	}

	private static int[] balancedOrNot(String[] expressions, int[] maxReplacements) {
		for (int i = 0; i < expressions.length; i++) {
			String exprssion = expressions[i];
			int maxReplacement = maxReplacements[i];
			int replacement = 0;
			Stack stack = new Stack<String>();
			for (int j = 0; j < exprssion.length(); j++) {
				if (exprssion.charAt(j) == '<') {
					stack.push('<');
				} else if (replacement <= maxReplacement) {
					if (stack.isEmpty()) {
						replacement++;
					} else {
						stack.pop();
					}

				}
			}

			if (stack.isEmpty()) {
				maxReplacements[i] = 1;
			} else {
				maxReplacements[i] = 0;
			}

		}
		return maxReplacements;
	}

}
