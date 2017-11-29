package com.techolution.problmes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LargestSubsetSum {

    static int getMaximumSumWithLCMN(int n) {
        int sum = 0;
        int limit = (int) Math.sqrt(n);

        for (int i = 1; i <= limit; i++) {
            if (n % i == 0) {
                if (i == (n / i))
                    sum += i;
                else
                    sum += (i + n / i);
            }
        }
        return sum;
    }

    static long[] maxSubsetSum(int[] k) {
        long resultArray[] = new long[k.length];
        for (int i = 0; i < k.length; i++) {
            resultArray[i] = getMaximumSumWithLCMN(k[i]);
        }
        return resultArray;
    }

    public static void main(String[] args) {
        BufferedReader reader = null;
        int arr[] = null;

        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine());
            arr = new int[n];
            for (int i = 0; i < n; i++) {
                int temp = Integer.parseInt(reader.readLine());
                arr[i] = temp;
            }

            long[] finalResults = maxSubsetSum(arr);
            for (int i = 0; i < finalResults.length; i++) {
                System.out.println(finalResults[i]);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
