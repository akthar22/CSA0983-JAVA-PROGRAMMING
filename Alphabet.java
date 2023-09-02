import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {
        String[] names = {"dilip", "pranav", "dhanush", "roshan", "gokul"};

      
        Arrays.sort(names);

        
        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
