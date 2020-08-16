import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.nio.file.*;
import java.io.IOException;

public class JavaStream {
	public static void main(String[] args) throws IOException {
		
		// 12. Stream rows from CSV file, store fields in HashMap
		Stream<String> rows3 = Files.line(Paths.get("data.txt"));
		Map<String, Integer> map = new HashMap<>();
		map = rows3
			.map(x -> x.split(","))
			.filter(x -> x.length == 3)
			.filter(x -> Integer.parseInt(x[1]) > 15)
			.collect(Collectors.toMap(
				x -> x[0],
				x -> Integer.parseInt(x[1])));
		rows3.close();
		for (String key : map.keySet()) {
			System.out.println(key + " " + map.get(key));
	}
}