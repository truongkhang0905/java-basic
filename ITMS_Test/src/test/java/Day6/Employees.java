package Day6;

import java.time.LocalDate;

public class Employees {
    int EmployeeID;
    String LastName;
    String FirstName;
    LocalDate BirthDate;
    String Photo;
    String Note;

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int employeeID) {
        EmployeeID = employeeID;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public LocalDate getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        BirthDate = birthDate;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String photo) {
        Photo = photo;
    }

    public String getNote() {
        return Note;
    }

    public void setNote(String note) {
        Note = note;
    }
    @Override
    public String toString() {
        return "Employees: " +
                "EmployeeID: " + EmployeeID +
                ", LastName: " + LastName +
                ", FirstName: " + FirstName +
                ", BirthDate: " + BirthDate +
                ", Photo: " + Photo +
                ", Notes: " + Note;
    }
}
