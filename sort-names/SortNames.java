import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortNames {

	public static void printList(List<String> names) {
		for (String name : names) {
			System.out.println(name);
		}
	}

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Peter", "Anna", "Mike", "Xenia");
		System.out.println("Unsorted:\n");
		printList(names);

		Collections.sort(names, (String a, String b) -> {
			return a.compareTo(b);
		});

		// Same way to sort the list
		Collections.sort(names, (String a, String b) -> a.compareTo(b));

		// Same way to sort the list, without type declarations
		Collections.sort(names, (a, b) -> a.compareTo(b));

		System.out.println("\nSorted:\n");
		printList(names);
	}
}