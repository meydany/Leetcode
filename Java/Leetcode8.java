class Leetcode8 {
    public int myAtoi(String str) {
        String num = "";
        boolean numbers = false;
        boolean negative = false;

        if(str.length() == 0) return 0;

        int start = 0;
        while(str.charAt(start) == ' ') {
            start++;
        }

        for(int i = start; i < str.length(); i++) {
            char c = str.charAt(i);
            if(Character.isDigit(c)) {
                num += c;
                numbers = true;
            }else if(numbers) {
                break;
            }else if(i < str.length()-1 && (c == '+' || c == '-') && Character.isDigit(str.charAt(i + 1))) {
                negative = c == '-' ? true : false;
            }else {
                return 0;
            }
        }

        if(num.length() == 0) return 0;

        try {
            long finalLong = Long.parseLong(num);

            if(finalLong <= Integer.MAX_VALUE && finalLong >= Integer.MIN_VALUE) {
                int finalInt = Integer.parseInt(num);
                return negative ? -finalInt: finalInt;
            }else {
                throw new NumberFormatException();
            }
        }catch(NumberFormatException e) {
            return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
    }
}
