package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// 登録済み商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 100, 200, 300, 400, 500 };
		int[] buyCounts = new int[5];

		for (int i = 0; i < 5; i++) {

			System.out.println(itemNames[i] + "の購入数>");
			String str1 = reader.readLine();
			int buy = Integer.parseInt(str1);

			buyCounts[i] = buy;
		}

		int Totalprices = 0;
		for (int j = 0; j < 5; j++) {
			System.out.println(itemNames[j] + ":" + (prices[j] * buyCounts[j] + "円"));
			Totalprices += (buyCounts[j] * prices[j]);
		}

		System.out.println("合計金額:" + Totalprices + "円");

	}

}
