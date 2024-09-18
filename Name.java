import java.util.Objects;

public class Name {
    private String firstName;
    private String lastName;
    private char middleInitial;

    public Name(String firstName, String lastName, char middleInitial) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setMiddleInitial(middleInitial);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName != null) {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName != null) {
            this.lastName = lastName;
        }
    }

    public char getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(char middleInitial) {
        this.middleInitial = middleInitial;
    }

    public String getFullName() {
        if(middleInitial != '\u0000') {
            return firstName + " " + middleInitial + ". " + lastName;
        }
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return this.getFullName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name = (Name) o;
        return middleInitial == name.middleInitial &&
                Objects.equals(firstName, name.firstName) &&
                Objects.equals(lastName, name.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, middleInitial);
    }
}
