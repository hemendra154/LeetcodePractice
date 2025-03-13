public class RomanNumberConverter {
    void print(){
        String s = "MCMXCIV";
        System.out.println(romanNumberConverter(s));
    }

    public int romanNumberConverter(String s) {
        int number = 0;
        int length = s.length();
        for(int i = 0; i< length; i++){
            Character c = s.charAt(i);
            switch (c){
                case 'I':
                    if(i+1 < length && (s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X')){
                        number =number +  returnValue(s.charAt(i+1)) - 1;
                        i++;
                    }else{
                        number = number +1;
                    }
                    break;
                case 'X':
                    if(i+1 < length && (s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C')){
                        number = number + returnValue(s.charAt(i+1)) - 10;
                        i++;
                    }else{
                        number = number +10;
                    }
                    break;
                case'C':
                    if(i+1 < length && (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M')){
                        number = number + returnValue(s.charAt(i+1)) - 100;
                        i++;
                    }else{
                        number = number +100;
                    }
                    break;
                default:
                    number = number + returnValue(c);
            }
        }
        return number;
    }

    private int returnValue(Character c){
        int value = 0;
        switch (c){
            case 'I':
                value = 1;
                break;
            case 'V':
                value = 5;
                break;
            case 'X':
                value = 10;
                break;
            case 'L':
                value = 50;
                break;
            case 'C':
                value = 100;
                break;
            case 'D':
                value = 500;
                break;
            case 'M':
                value = 1000;
                break;
        }
        return value;
    }
}
