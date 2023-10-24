package programming.problems;

import java.util.LinkedList;

public class EnglishIntegers {
    String[] smalls = {"Zero", "One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};

    String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    String[] bigs = {"", "Thousand", "Million", "Billion"};


    public String numberToWords(int num) {
        if(num == 0) return smalls[0];

        LinkedList<String> parts = new LinkedList<String>();

        int chunkCount = 0;

        while(num > 0) {
            if(num %1000 != 0){
                if(chunkCount > 0){
                    parts.addFirst(covertThousandChunks(num %1000)+" "+bigs[chunkCount]);
                } else {
                    parts.addFirst(covertThousandChunks(num %1000));
                }
                // parts.addLast(bigs[chunkCount]);
            }
            chunkCount++;
            num /= 1000;
        }
        return listToString(parts);

    }
    private String covertThousandChunks(int num) {
        LinkedList<String> parts = new LinkedList<String>();
        if(num >= 100) {
            parts.addLast(smalls[num/100]);
            parts.addLast("Hundred");
            num %= 100;
        }
        if(num >= 10 && num <= 19) {
            parts.addLast(smalls[num]);
        } else if(num >= 20) {
            parts.addLast(tens[num/10]);
            num %= 10;
        }
        if(num >= 1 && num <= 9) {
            parts.addLast(smalls[num]);
        }
        return listToString(parts);
    }

    private String listToString(LinkedList<String> parts) {
        StringBuilder sb =  new StringBuilder();
        while(parts.size() > 1) {
            sb.append(parts.pop());
            sb.append(" ");
        }
        sb.append(parts.pop());
        return sb.toString();
    }
}
