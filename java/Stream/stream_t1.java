package Stream;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class stream_t1 {

	public static void main(String[] args) {

		String[] strArr = {"aaa","bb","c","dddd"};
		Stream<String> strstream = Stream.of(strArr);
		
		int sum = strstream.mapToInt(s-> s.length()).sum();
//		int sum = strstream.mapToInt(String::length).sum();
		System.out.println(sum);
		
		Stream<String> strstream2 = Stream.of(strArr);
		strstream2.map(String::length)
				.sorted(Comparator.reverseOrder())
				.limit(1).forEach(System.out::println);
		
		Stream<String> strstream3 = Stream.of(strArr);
		Optional<String> str3 = strstream3.max(Comparator.comparing(String::length));
		str3.ifPresent(s-> System.out.println(s.length()));
		
		
	}

}
