import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Student {
    private String name;
    private List<String> randomString = new ArrayList<>();
    public Student() {
        randomString.add("random");
    }
    public Student(String name) {
        this.name = name;
    }
    public Optional<String> getStringByIndex(int index) {
        if (index >= randomString.size()) {
            return Optional.empty();
        } else {
            return Optional.of(randomString.get(index));
        }
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public List<String> getRandomString() {
        return randomString;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}