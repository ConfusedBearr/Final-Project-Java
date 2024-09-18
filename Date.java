import java.util.Objects;

public class Date {
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year) {
        this.setMonth(month);
        this.setDay(day);
        this.setYear(year);
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month >= 1 && month <= 12) {
            this.month = month;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day >= 1 && day <= 31) {
            this.day = day;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year >= 1900 && year <= 2100) {
            this.year = year;
        }
    }

    @Override
    public String toString() {
        return this.getMonth() + "/" + this.getDay() + "/" + this.getYear();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Date date = (Date) o;
        return month == date.month &&
                day == date.day &&
                year == date.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(month, day, year);
    }
}
