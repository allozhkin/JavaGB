package seminar_005;

public class task1 {
    public static void main(String[] args) {
        Passport passport = new Passport();
        passport.add("123465", "Иванов");
        passport.add("1556465", "Петров");
        passport.add("123887", "Сидоров");
        passport.add("789665", "Козлов");
        passport.add("12332325", "Иванов");
        passport.print("Иванов");
    }
}
