package c.oop2;

public class Utill {
    String concat(String... strings) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            sb.append(strings[i]);
            sb.append(' ');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Utill u = new Utill();
        String result = u.concat("사과", "바나나", "포도");
        System.out.println(result);
    }
}
