import java.util.Objects;

public class Student extends Person implements Cheatable {
    private String major;
    private double gpa;
    private boolean cheater;

    public Student(Name name, Date dob, String major, double gpa, boolean cheater) {
        super(name, dob);    
        this.setMajor(major);
        this.setGpa(gpa);
        this.setCheater(cheater);
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        if(major != null) {
            this.major = major;
        }
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if(gpa >= 0 && gpa <= 4.0) {
            this.gpa = gpa;
        }
    }

    public boolean isCheater() {
        return cheater;
    }

    public void setCheater(boolean cheater) {
        this.cheater = cheater;
    }

    @Override
    public void cheat() {
        if(this.isCheater()) {
            System.out.println("I'm cheating on the test!");
        } else {
            System.out.println("I would never cheat on a test.");
        }
    }

    @Override
    public void thisIsWhatIDo() {
        System.out.println("I am a student.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Major: " + this.getMajor() + ", GPA: " + this.getGpa() + ", Cheater: " + this.isCheater();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Double.compare(student.gpa, gpa) == 0 &&
                cheater == student.cheater &&
                Objects.equals(major, student.major);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), major, gpa, cheater);
    }
    
    public interface Cheatable {
        void cheat();
    }
    
}

