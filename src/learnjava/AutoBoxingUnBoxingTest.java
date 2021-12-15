package learnjava;

public class AutoBoxingUnBoxingTest {
    public static void main(String[] args) {
        Integer intObj = 3;
        Character charObj = 'c';
        Boolean booleanObj = true;
        System.out.println(intObj instanceof Integer);
        int numb = intObj;
        System.out.println(numb);
        
        int it1 = Integer.parseInt("3");
        System.out.println(it1);
        boolean bool1 = Boolean.parseBoolean("true");
        System.out.println(bool1);
        System.out.println("3");

    }
}
