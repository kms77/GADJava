package Laboratory1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FooBarQix {
    public int getReversedNumber(int number){
        int reversed = 0;
        while(number!=0){
            reversed =reversed*10 + number%10;
            number=number/10;
        }
        return reversed;
    }

    public String checkIf_NumberContains_SpecialDigits(int number){
        String result = "";
        int reversed = getReversedNumber(number);
        int lastDigit;
        while(reversed!=0){
            lastDigit = reversed%10;
            switch (lastDigit){
                case 3 -> result = result.concat("Foo");
                case 5 -> result = result.concat("Bar");
                case 7 -> result = result.concat("Qix");
                default -> {}
            }
            reversed/=10;
        }
        return result;
    }

    public String checkIf_NumberContains_SpecialDigits2(int number){
        String result = "";
        int reversed = getReversedNumber(number);
        int lastDigit;
        while(reversed!=0){
            lastDigit = reversed%10;
            switch (lastDigit){
                case 0 -> result = result.concat("*");
                case 3 -> result = result.concat("Foo");
                case 5 -> result = result.concat("Bar");
                case 7 -> result = result.concat("Qix");
                default -> {}
            }
            reversed/=10;
        }
        return result;
    }

    public String changeZeroWithStar(int number){
        String result = "";
        int lastDigit;
        while(number!=0){
            lastDigit = number%10;
            if(lastDigit == 0){
                result = result.concat("*");
            }
            else{
                result = result.concat(String.valueOf(lastDigit));
            }
            number/=10;
        }
        result = new StringBuilder(result).reverse().toString();
        return result;
    }

    public String checkIf_GivenNumberIsDivisible_bySpecialNumbers(int number){
        String result = "";
        if(number%3==0){
            result = result.concat("Foo");
        }
        if(number%5==0){
            result = result.concat("Bar");
        }
        if(number%7==0){
            result = result.concat("Qix");
        }
        return result;
    }

    public String compute(int number){
        String result = "";
        result = result.concat(checkIf_GivenNumberIsDivisible_bySpecialNumbers(number));
        if(number == 0){
            return result;
        }
        else {
            result = result.concat(checkIf_NumberContains_SpecialDigits(number));
            if (result.isBlank()) {
                    result = result.concat(String.valueOf(number));
            }
        }
        return result;
    }

    public String compute2(int number){
        String result = "";
        result = result.concat(checkIf_GivenNumberIsDivisible_bySpecialNumbers(number));
        if(number == 0){
            return result.concat("*");
        }
        else {
            result = result.concat(checkIf_NumberContains_SpecialDigits2(number));
            Pattern pattern=Pattern.compile("^\\*+$");
            Matcher matcher=pattern.matcher(result);
            boolean matchFound= matcher.find();
            if(matchFound) {
                result = "";
                result = result.concat(changeZeroWithStar(number));
            }
            else {
                if (result.isBlank()) {
                     result = result.concat(String.valueOf(number));
                }
            }
            return result;
        }
    }

    public String result_StageOne(){
        String output = "Sample output for numbers from 0 to 100: \n";
        for(int index = 0; index <= 100; index++){
            output = output.concat(compute(index) + "\n");
        }
        return output;
    }

    public String result_StageTwo(){
        String output = "Sample output: \n";
        int[] problemTestNumbers = {101, 303, 105, 10101, 1010011};
        for (int number : problemTestNumbers) {
            output = output.concat(number + " => " + compute2(number) + "\n");
        }
        return output;
    }

}
