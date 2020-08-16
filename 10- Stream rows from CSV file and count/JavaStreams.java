import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.nio.file.*;
import java.io.IOException;

public class JavaStream {
	public static void main(String[] args) throws IOException {
		
		// 10. Stream rows from CSV file and count
		Stream<String> rows1 = Files.line(Paths.get("data.txt"));
		int rowCount = (int) rows1
			.map(x -> x.split(","))
			.filter(x -> x.length == 3)
			.count();
		System.out.println(rowCount + " rows.");
		rows1.close();
	}
}