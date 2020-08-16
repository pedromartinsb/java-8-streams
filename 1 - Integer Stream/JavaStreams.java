import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.nio.file.*;
import java.io.IOException;

public class JavaStream {
	public static void main(String[] args) throws IOException {
		
		// 1. Integer Stream
		IntStream
			.range(1, 10)
			.forEach(System.out::print);
		System.out.println();
	}
}