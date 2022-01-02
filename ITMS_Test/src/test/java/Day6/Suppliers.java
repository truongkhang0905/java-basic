package Day6;

public class Suppliers {
    int SupplierID;
    String SupplierName;
    String ContactName;
    String Address;
    String City;
    String PostalCode;
    String Country;
    String Phone;

    public int getSupplierID() {
        return SupplierID;
    }

    public void setSupplierID(int supplierID) {
        SupplierID = supplierID;
    }

    public String getSupplierName() {
        return SupplierName;
    }

    public void setSupplierName(String supplierName) {
        SupplierName = supplierName;
    }

    public String getContactName() {
        return ContactName;
    }

    public void setContactName(String contactName) {
        ContactName = contactName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(String postalCode) {
        PostalCode = postalCode;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
    @Override
    public String toString() {
        return "Suppliers: " +
                "SupplierID: " + SupplierID +
                ", SupplierName: " + SupplierName +
                ", ContactName: " + ContactName +
                ", Address: " + Address +
                ", City: " + City +
                ", PostalCode: " + PostalCode +
                ", Country: " + Country +
                ", Phone: " + Phone;
    }
}
