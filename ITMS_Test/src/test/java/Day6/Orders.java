package Day6;

import java.time.LocalDate;

public class Orders {
    int OrderID;
    int CustomerID;
    int EmployeeID;
    LocalDate OrderDate;
    int ShipperID;

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int orderID) {
        OrderID = orderID;
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int customerID) {
        CustomerID = customerID;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int employeeID) {
        EmployeeID = employeeID;
    }

    public LocalDate getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        OrderDate = orderDate;
    }

    public int getShipperID() {
        return ShipperID;
    }

    public void setShipperID(int shipperID) {
        ShipperID = shipperID;
    }
    @Override
    public String toString() {
        return "Orders: " +
                "OrderID: " + OrderID +
                ", CustomerID: " + CustomerID +
                ", EmployeeID: " + EmployeeID +
                ", OrderDate: " + OrderDate +
                ", ShipperID: " + ShipperID;
    }
}
