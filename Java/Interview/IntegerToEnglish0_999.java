package Assessment;

import java.util.HashMap;
import java.util.Map;

public class IntegerToEnglish0_999 {
    
    static Map<Integer, String> TERMS  = new HashMap<Integer, String>() {{
        put(0, "zero");
        put(1, "one");
        put(2, "two");
        put(3, "three");
        put(4, "four");
        put(5, "five");
        put(6, "six");
        put(7, "seven");
        put(8, "eight");
        put(9, "nine");
        put(10, "ten");
        put(11, "eleven");
        put(12, "twelve");
        put(13, "thirteen");
        put(14, "fourteen");
        put(15, "fifteen");
        put(16, "sixteen");
        put(17, "seventeen");
        put(18, "eighteen");
        put(19, "ninteen");
        put(20, "twenty");
        put(30, "thirtee");
        put(40, "forty");
        put(50, "fifty");
        put(60, "sixty");
        put(70, "seventy");
        put(80, "eighty");
        put(90, "ninety");
    }};
        
    public static String IntegerToEnglish(int number) {
        String answer = "";
        if(number/ 100 > 0) {
            answer = answer + TERMS.get(number/100) + " hundred ";
            number -= (number/100)*100;
        }
        if(number == 0) return answer;
        if(TERMS.containsKey(number)) {
            answer = answer + TERMS.get(number);
            return answer;
        }
        if(TERMS.containsKey(number/10) && number/
        10!=0) answer = answer + TERMS.get((number/10)*10) + " ";
        if(TERMS.containsKey(number%10) && number%10!=0) answer = answer + TERMS.get((number%10));

        return answer;
    }

    // 345

    
    public static void main(String[] args) {
        print("0: "+IntegerToEnglish(0));
        print("999: "+IntegerToEnglish(999));
        print("5: "+IntegerToEnglish(5));
        print("10: "+IntegerToEnglish(10));
        print("11: "+IntegerToEnglish(11));
        print("13: "+IntegerToEnglish(13));
        print("25: "+IntegerToEnglish(25));
        print("45: "+IntegerToEnglish(45));
        print("55: "+IntegerToEnglish(55));
        print("65: "+IntegerToEnglish(65));
        print("99: "+IntegerToEnglish(99));
        print("77: "+IntegerToEnglish(77));
        print("120: "+IntegerToEnglish(120));
        print("113: "+IntegerToEnglish(113));
        print("199: "+IntegerToEnglish(199));
        print("345: "+IntegerToEnglish(345));
        print("900: "+IntegerToEnglish(900));
        print("100: "+IntegerToEnglish(100));
        print("333: "+IntegerToEnglish(333));
        print("555: "+IntegerToEnglish(555));
        print("666: "+IntegerToEnglish(666));
        print("777: "+IntegerToEnglish(777));
    }

    public static void print(String str) {
        System.out.println(str);
    }
}
