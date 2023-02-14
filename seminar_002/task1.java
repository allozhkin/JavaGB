package seminar_002;


public class task1 {
    public static void main(String[] args) {
        String s = "aaaabbbcddiiooopppppp";
        StringBuilder s1 = new StringBuilder();
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            var tamp = s.charAt(i-1);
            if (tamp == s.charAt(i)){
                count++;
            }
            else{
                s1.append(count);
                s1.append(tamp);
                count = 1;
            }
            if (i == s.length()-1){
                s1.append(count);
                s1.append(s.charAt(i));

            }
        }
        System.out.println(s1);
    }
}
