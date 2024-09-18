import java.util.Date;
import java.util.Objects;

public abstract class Person{
    Name name;
    Date dob;

    public Person(Name name, Date dob) {
        this.setName(name);
        this.setDob(dob);
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        if(name != null) {
            this.name = name;
        }
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        if(dob != null) {
            this.dob = dob;
        }
    }

    public abstract void thisIsWhatIDo();

    @Override
    public String toString() {
        return "Name: " + this.getName().getFullName() + ", DOB: " + this.getDob();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(dob, person.dob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dob);
    }
}
