package com.demo;

interface StringToIntMapper {
	int map(String str);
}

public class Ex_5 {

	public static void main(String[] args) {

		// StringToIntMapper mapper = new StringToIntMapper() {
		// @Override
		// public int map(String str) {
		// return str.length();
		// }
		// };
		// System.out.println(mapper.map("hello"));

		// or

		// StringToIntMapper mapper = (String str) -> {
		// return str.length();
		// };

		// StringToIntMapper mapper = (str) -> {
		// return str.length();
		// };

		// StringToIntMapper mapper = str -> {
		// return str.length();
		// };

		StringToIntMapper mapper = str -> str.length();

		int len = mapper.map("hello");
		System.out.println(len);

	}

}
