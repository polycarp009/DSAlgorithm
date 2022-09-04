package com.learn.bitmanipulation;

public class SumofBinary {
public static void main(String[] args) {
	addBinary("100", "11");
}
public static String addBinary(String A, String B) {
	StringBuilder result = new StringBuilder();
    int i = A.length() - 1;
    int j = B.length() - 1;
    int carryOver = 0;
    while(i >= 0 || j >= 0) {
        int sum = carryOver;
        if(i >= 0) { sum = sum + A.charAt(i) - '0';  }
        if(j >= 0) { sum = sum + B.charAt(j) - '0'; }
        result.append(sum % 2);
        carryOver = sum / 2;
        i--;
        j--;
    }
    if(carryOver > 0) {
        result.append(carryOver);
    }
//    System.out.println(result);
    return result.reverse().toString();
}
}
