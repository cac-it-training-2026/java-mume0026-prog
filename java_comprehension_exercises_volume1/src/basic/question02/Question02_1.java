package basic.question02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第5章 入出力
 */

public class Question02_1 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("名前を入力してください。");
		String name = reader.readLine();

		System.out.println("\n好きなスポーツを入力してください。");
		String sports = reader.readLine();

		System.out.println("\n私の名前は" + name + "です。");
		System.out.println("好きなスポーツは" + sports + "です。");

	}
}
