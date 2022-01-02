package Day6;

public class Shippers {
    int ShipperID;
    String ShipperName;
    String Phone;

    public int getShipperID() {
        return ShipperID;
    }

    public void setShipperID(int shipperID) {
        ShipperID = shipperID;
    }

    public String getShipperName() {
        return ShipperName;
    }

    public void setShipperName(String shipperName) {
        ShipperName = shipperName;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
    @Override
    public String toString() {
        return "Shippers: " +
                "ShipperID: " + ShipperID +
                ", ShipperName: " + ShipperName +
                ", Phone: " + Phone;
    }
}
