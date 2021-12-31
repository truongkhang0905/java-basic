package Day5;

public class TestNull {
    public static void main(String[] args) {
        String abc = null;
        System.out.println(abc);
        try {
            Student st = null;
            System.out.println(st.name);
        } catch (NullPointerException ex) {
            System.out.println("The object is null");
        }

    }
    class Student {
        String name;
    }
}
