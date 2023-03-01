package FinalWorkJava;

import java.util.Objects;

public class Laptop {
    Integer operativeMemory;
    Integer hardDisc;
    String oSys;
    String color;

    public Laptop(Integer operativeMemory, Integer hardDisc, String oSys, String color) {
        this.operativeMemory = operativeMemory;
        this.hardDisc = hardDisc;
        this.oSys = oSys.toLowerCase();
        this.color = color.toLowerCase();
    }

    @Override
    public String toString() {
        return "Operative Memory: " + operativeMemory + ", HDD memory: " + hardDisc + ", OS: "
                + oSys + ", Color: " + color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Laptop)) {
            return false;
        }
        Laptop laptop = (Laptop) o;
        return operativeMemory == laptop.operativeMemory && hardDisc == laptop.hardDisc;
    }

    @Override
    public int hashCode() {

        return Objects.hash(hardDisc, operativeMemory, oSys, color);
    }
}
