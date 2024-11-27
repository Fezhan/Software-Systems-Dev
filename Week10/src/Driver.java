import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Driver {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student(1, "JJ. Jognson", 38));
		students.add(new Student(2, "P. Tibbs", 48));
		students.add(new Student(3, "W. Major", 28));
		students.add(new Student(4, "P. Turner", 60));
		students.add(new Student(5, "A. Ball", 20));
		students.add(new Student(6, "B. Smithy", 90));
		students.add(new Student(7, "R. Jules", 71));
		students.add(new Student(8, "T. Verne", 97));

		students.stream()
			.forEach(System.out::println);
		
		System.out.println("\n");
		
		students.stream()
			.filter(c -> c.getGrade() >= 70)
			.forEach(System.out::println);
		
		System.out.println("\n");
		
		Object[] studentArray = students.stream()
				.map(c -> c.getName().toUpperCase())
				.sorted()
				.toArray();
		
		System.out.println(Arrays.toString(studentArray));	
		
		double aveGrade = students.stream()
				.mapToDouble(Student::getGrade)
				.average()
				.getAsDouble();
		
		System.out.println("\n" + aveGrade + "\n");
		
		
		IntStream.range(90,101)
			.map(n -> n * n * n)
			.forEach(System.out::println);
		
		List<Integer> numList = Stream.generate(Math::random)
				.map(n -> (int) (n * 5 -1))
				.limit(10)
				.collect(Collectors.toList());
		
		System.out.println("\n");
		
		for (int next: numList) {
			System.out.println(next);
		}
	}
}
