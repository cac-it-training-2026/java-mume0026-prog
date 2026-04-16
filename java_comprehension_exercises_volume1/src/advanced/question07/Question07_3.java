package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 登録済み商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 100, 200, 300, 400, 500 };
		// 購入数（変更不可）
		int[] amounts = new int[5];
		int[] stocks = { 3, 5, 2, 11, 4 };

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < 5; i++) {
			System.out.println(itemNames[i] + "の在庫数:>" + stocks[i]);

		}

		for (int i = 0; i < 5; i++) {

			System.out.println(itemNames[i] + "の購入数>");
			String str1 = reader.readLine();
			int buy = Integer.parseInt(str1);

			amounts[i] = buy;

			if (amounts[i] > stocks[i]) {
				System.out.println("在庫数を超えています。もう一度入力してください。");
				i -= 1;
			}
		}
		int Totalprices = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println(itemNames[i] + ":" + (prices[i] * amounts[i] + "円"));
			Totalprices += (amounts[i] * prices[i]);
		}

		System.out.println("合計金額:" + Totalprices + "円");

	}

}
