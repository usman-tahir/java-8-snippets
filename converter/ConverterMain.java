
public class ConverterMain {
	public static void main(String[] args) {
		// Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
		Converter<String, Integer> converter = Integer::valueOf; // referencing a static method using the :: keyword (same idea as above)
		Integer converted = converter.convert("123");
		System.out.println(converted);

		// String manipulation
		Start start = new Start();
		Converter<String, String> newConverter = start::startsWith;
		String convertedString = newConverter.convert("Java");
		System.out.println(convertedString);
	}
}