package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_1 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String[] itemNames = new String[5];
		int[] prices = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("商品" + (i + 1) + "を入力してください。");
			String item = reader.readLine();

			itemNames[i] = item;
		}

		for (int j = 0; j < 5; j++) {
			System.out.println("\n各商品の単価を順に入力してください。");
			String str1 = reader.readLine();
			int itemPrices1 = Integer.parseInt(str1);

			prices[j] = itemPrices1;
		}

		for (int k = 0; k < 5; k++) {
			System.out.println("\n登録商品一覧");
			System.out.println(itemNames[k] + ":" + prices[k] + "円");
		}
	}
}
