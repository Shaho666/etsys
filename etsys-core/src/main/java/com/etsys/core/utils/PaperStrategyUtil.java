package com.etsys.core.utils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PaperStrategyUtil {

	private PaperStrategyUtil() {

	}

	public static List<Integer> generateRandomStrategy(int num, int range) {

		if (num >= range)
			return null;

		List<Integer> strategy = null;

		Random random = new Random();
		Integer[] result = new Integer[num];

		for (int i = 0; i < result.length; i++) {
			result[i] = random.nextInt(range) + 1;

			for (int j = 0; j < i; j++) {
				if (result[i] == result[j]) {
					result[i] = random.nextInt(range) + 1;
					j = 0;
				}
			}
		}

		strategy = Arrays.asList(result);
		return strategy;
	}

}
