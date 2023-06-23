import java.util.LinkedList;

public class IntegerToEnglish {
    String[] smalls = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
            "Twelve", "Thirteen", "Fourteen",
            "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
    String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
    String[] bigs = { "", "Thousand", "Million", "Billion" };
    String hundred = "Hundred";
    String negative = "Negative";

    public String convert(int num) {
        if(num == 0) {
            return smalls[0];
        } else if (num < 0) {
            return negative + " " + convert(-1 * num);
        }

        LinkedList<String> parts = new LinkedList<String>();
        int chunkCount = 0;

        while(num > 0) {
            if(num % 1000 != 0) {
                String chunk = convertChunk(num % 1000) + " " + bigs[chunkCount];
                parts.addFirst(chunk);
            }
            num /= 1000;
            chunkCount++;
        }
        
        return listToString(parts);
    }
    
    private String convertChunk(int num) {
        LinkedList<String> parts = new LinkedList<String>();
        
        // Convert hundreds place
        if(num >= 100) {
            parts.addLast(smalls[num/100]);
            parts.addLast(hundred);
            num %= 100;
        }

        // Convert tens place
        if(num >= 10 && num <= 19) {
            parts.addLast(smalls[num]);
        } else if(num >= 20) {
            parts.addLast(tens[num / 10]);
            num %= 10;
        }

        // Convert ones place
        if(num >= 1 && num <= 9) {
            parts.addLast(smalls[num]);
        }
        return listToString(parts);
    }

    public String listToString(LinkedList<String> list) {
        StringBuilder sb = new StringBuilder();
        while(list.size() > 1) {
            sb.append(list.pop());
            sb.append(" ");
        }
        sb.append(list.pop());
        return sb.toString();
    }
}
