package Day5;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setId(1);
        emp1.setName("Khang");
        emp1.setSalary("2k");
        emp1.setTitle("Assistant");

        System.out.println(emp1);

//        System.out.println(emp1.getId());
//        System.out.println(emp1.getName());
//        System.out.println(emp1.getSalary());
//        System.out.println(emp1.getTitle());


        Employee emp2 = new Employee();
        emp2.setId(1);
        emp2.setName("Khang");
        emp2.setSalary("2k");
        emp2.setTitle("Assistant");

        Employee emp3 = emp1;
        emp3.setSalary("4k");
        System.out.println(emp3);

    }


}
