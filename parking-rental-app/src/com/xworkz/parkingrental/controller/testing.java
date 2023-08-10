package com.xworkz.parkingrental.controller;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Date;

public class testing {

	public static void main(String[] args) throws IOException {

		System.out.println(LocalDateTime.now());

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy hh:mm aa");
		String formattedDate = dateFormat.format(new Date()).toString();
		System.out.println(formattedDate);

		System.out.println("LocalTime.now().plusSeconds(120): " + LocalTime.now().plusSeconds(120));

		System.out.println("new Date(): " + new Date());
		String str = "Today is tuesday";

		String array[] = str.split(" ");
		System.out.println("Split method output:");
		for (String s : array) {
			System.out.println(s);
		}

		System.out.println("using for loop:");
		for (int s = 0; s <= array.length - 1; s++) {
			System.out.println(array[s]);
		}

		int price = 100;
		String discount = "5";
		String url = "http://localhost:8080/parking-rental-app/validateFields/" + price + "/" + discount;
		System.out.println("url: " + url);

		String otp = "1234";
		String encryptedpassword = enryptOtp(otp);
		System.out.println("encryptedOtp: " + encryptedpassword);

		String decryptOtp = decryptOtp(getByte());
		System.out.println("decryptOtp: " + decryptOtp.toString());

		System.out.println("--------------------arrays---------------------");

		int[] num = { 10, 5, 7, 45, 7, 3, 2, 20 };

		System.out.println("arrays: " + Arrays.toString(num));
		// inbuilt method
		// Arrays.sort(num);
		// System.out.println("after sorting using sort() method: " +
		// Arrays.toString(num));

		for (int i = 0; i < num.length - 1; i++) {

			System.out.println("i value: " + i);
			for (int j = i + 1; j < num.length; j++) {
				System.out.println("j value: " + j);
				if (num[i] < num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
				System.out.println("after iteration");
				System.out.println("num[" + i + "]: " + num[i]);
				System.out.println("num[" + j + "]: " + num[j]);
			}
			System.out.println("after iterating inner for loop each time: " + Arrays.toString(num));

		}

		System.out.println("after sorting: " + Arrays.toString(num));

		System.out.println("smallest and largest number of array");

		int[] n = { 56, 28, 78, 46, 10, 39, 56 };

		int min = n[0];
		int max = n[0];
		for (int i = 1; i < n.length; i++) {
			System.out.println("min: " + min + " & max: " + max);
			if (n[i] < min) {
				min = n[i];
			} else if (n[i] > max) {
				max = n[i];
			}
		}
		System.out.println("min: " + min + " & max: " + max);

		// reverse of string
		String name = "Savitri";

		String reverseString = "";
		char[] ch = name.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			reverseString += ch[i];
		}

		System.out.println("reverseString: " + reverseString);

		// reverse of sentence
		String fullName = "Savitri Kandgal";

		String reverseName = "";
		String[] strArray = fullName.split(" ");
		for (int i = strArray.length - 1; i >= 0; i--) {
			reverseName += strArray[i];
			for (int j = strArray.length - 2; j >= 0; j--) {
				reverseName += " ";
			}
		}
		System.out.println("reverseName: " + reverseName);

	}

//	static String encryptedOtp = null;
	static byte[] bytes = null;

	public static byte[] getByte() {
		return bytes;
	}

	public static String enryptOtp(String otp) throws IOException {
		System.out.println("otp: " + otp);
		bytes = otp.getBytes();
		System.out.println("bytes: " + bytes);
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < bytes.length; i++) {
			s.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
		}
		/* Complete hashed password in hexadecimal format */
		String encryptedOtp = s.toString();
		// System.out.println("encryptedOtp: "+encryptedOtp);
		// int encryptedOtpInInt = Integer.valueOf(encryptedOtp);
		System.out.println("encryptedOtp: " + encryptedOtp);
		return encryptedOtp;
		// return encryptedOtp;
	}

	public static String decryptOtp(byte[] encryptedOtp) throws IOException {
		String result = new String(encryptedOtp, StandardCharsets.UTF_8);
		System.out.println("Converted String: " + result);
		return result;
	}

}

//${pageContext.request.contextPath}