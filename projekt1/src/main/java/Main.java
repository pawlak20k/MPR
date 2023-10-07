import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Student jan = new Student();
        jan.setName("Jan");
//        Student mateusz = jan;
//        mateusz.setName("Mateusz");
//
//        List<Student> lista = new ArrayList<>();
//        lista.add(mateusz);
//        lista.add(new Student("Arkadiusz"));
//
//        for (Student pojedynczyStudent : lista) {
//            try {
//                List<String> randomString = pojedynczyStudent.getRandomString();
//                System.out.println(randomString);
//            } catch (NoSuchElementException e) {
//                System.out.println("zlapalem :)");
//            } finally {
//                System.out.println("Udało się");
//            }
//        }
        Optional<String> optionalString = jan.getStringByIndex(0);
        String s = optionalString.map(String::toUpperCase)
                .orElse("Optional was empty");
        System.out.println(s);
        if (optionalString.isPresent()) {
            String value = optionalString.get();
            System.out.println(value.toUpperCase());
        } else if (optionalString.isEmpty()) {
            System.out.println("Optional was empty");
        }
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Arkadiusz"));
        studentList.add(new Student("Arkadiusz"));
        studentList.add(new Student("Wiktoria"));
        List<Student> a = studentList.stream()
                .map(student -> changeStudentNameToUpperCase(student))
                .filter(student -> student.getName().startsWith("A"))
                .toList();
        System.out.println(a);
        boolean isEmpty = CollectionUtils.isNotEmpty(studentList);
        System.out.println(isEmpty);
    }
    private static Student changeStudentNameToUpperCase(Student student) {
        student.getName().toUpperCase();
        return student;
    }
}