package g.javaclass;

public class WrapperMain {
    public static void main(String[] args) {
        int primitive = 10;
        // 박싱 (Boxing)
        Integer wrapper = Integer.valueOf(primitive);
        System.out.println(wrapper);

        // 언박싱 (Unboxing)
        Integer wrapper2 = Integer.valueOf(20);
        int primitive2 = wrapper2.intValue();
        System.out.println(primitive2);

        // 오토박싱/언박싱
        Integer wrapper3 = 10;
        int primitive3 = wrapper3;

        Integer w = null;   // class는 항상 참조라서 가능
        // int v = w;       // 오류 발생

        // 문자열 파싱
        int parsed = Integer.parseInt("123");
        System.out.println(parsed);

        Integer a = 10;
        Integer b = 20;
        System.out.println(a.compareTo(b));
    }
}
