import java.time.LocalDate;

public class Cat {
    String color;
    String name;
    LocalDate dateOfBirth;

    public Cat(String color, String name, LocalDate dateOfBirth){
        this.name = name.toLowerCase();
        this.color = color.toLowerCase();
        this.dateOfBirth = dateOfBirth;
    }

    int getAge() {
        LocalDate date = LocalDate.now();
        return date.getYear() - dateOfBirth.getYear();
    }

    @Override
    public String toString() {
        return " name: " + name + " color: " + color + " years: " + getAge();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cat)) {
            return false;
        }
        Cat cat = (Cat) obj;
        if (name.equals(cat.name) && color.equals(cat.color) && dateOfBirth.equals(cat.dateOfBirth)) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public int hashCode() {
        return name.hashCode() + 7 * color.hashCode() + 13 * dateOfBirth.hashCode();
    }

}
