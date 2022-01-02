package Day6;

import java.time.LocalDate;

public class Controller {
    public static void main(String[] args) {
        Employees emp1 = new Employees();
        emp1.setEmployeeID(1);
        emp1.setFirstName("Nancy");
        emp1.setLastName("Davolio");
        emp1.setBirthDate(LocalDate.of(1968, 12, 8));
        emp1.setPhoto("EmpID1.pic");
        emp1.setNote("Education includes a BA in psychology from Colorado State University. She also completed (The Art of the Cold Call). Nancy is a member of 'Toastmasters International'.");

        System.out.println(emp1);
        System.out.println("----------------------------------------------------------");

        Categories cat1 = new Categories();
        cat1.setCategoryID(1);
        cat1.setCategoryName("Beverages");
        cat1.setDescription("Soft drinks, coffees, teas, beers, and ales");

        System.out.println(cat1);
        System.out.println("----------------------------------------------------------");

        Customers cust1 = new Customers();
        cust1.setCustomerID(1);
        cust1.setCustomerName("Alfreds Futterkiste");
        cust1.setContactName("Maria Anders");
        cust1.setAddress("Obere Str. 57");
        cust1.setCity("Berlin");
        cust1.setPostalCode("12209");
        cust1.setCountry("Germany");

        System.out.println(cust1);
        System.out.println("----------------------------------------------------------");

        OrderDetails orddet = new OrderDetails();
        orddet.setOrderDetailID(1);
        orddet.setOrderID(10248);
        orddet.setProductID(11);
        orddet.setQuantity(12);

        System.out.println(orddet);
        System.out.println("----------------------------------------------------------");

        Orders ord = new Orders();
        ord.setOrderID(10248);
        ord.setCustomerID(90);
        ord.setEmployeeID(5);
        ord.setOrderDate(LocalDate.of(1996, 7, 4));
        ord.setShipperID(3);

        System.out.println(ord);
        System.out.println("----------------------------------------------------------");

        Products pro = new Products();
        pro.setProductID(1);
        pro.setProductName("Chais");
        pro.setSupplierID(1);
        pro.setCategoryID(1);
        pro.setUnit("10 boxes x 20 bags");
        pro.setPrice(18);

        System.out.println(pro);
        System.out.println("----------------------------------------------------------");

        Shippers ship = new Shippers();
        ship.setShipperID(1);
        ship.setShipperName("Speedy Express");
        ship.setPhone("(503) 555-9831");

        System.out.println(ship);
        System.out.println("----------------------------------------------------------");

        Suppliers supp = new Suppliers();
        supp.setSupplierID(1);
        supp.setSupplierName("Exotic Liquid");
        supp.setContactName("Charlotte Cooper");
        supp.setAddress("49 Gilbert St.");
        supp.setCity("Londona");
        supp.setPostalCode("EC1 4SD");
        supp.setCountry("UK");
        supp.setPhone("(171) 555-2222");

        System.out.println(supp);
        System.out.println("----------------------------------------------------------");
    }
}
