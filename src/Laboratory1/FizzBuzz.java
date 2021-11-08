package Laboratory1;

public class FizzBuzz {
    public String result_StageOne(){
        String result = "Sample output for numbers from 1 to 100:\n";
        for(int index=1;index<=100;index++){
            if(index%3==0 && index%5==0) {
                result = result.concat("FizzBuzz\n");
            }
            else{
                if (index % 3 == 0) {
                    result = result.concat("Fizz\n");
                } else if (index % 5 == 0) {
                    result = result.concat("Buzz\n");
                }
                else{
                    result = result.concat(index + "\n");
                }
            }
        }
        return result;
    }
    public String result_StageTwo(){
        String result = "Sample output for numbers from 1 to 100:\n";
        for(int index=1;index<=100;index++){
            if(index%3==0 && index%5==0) {
                result = result.concat("FizzBuzz\n");
            }
            else{
                if(index % 11 ==0){
                    result = result.concat("Jazz\n");
                }
                else if(index % 7 == 0){
                    result = result.concat("Rizz\n");
                }
                else if (index % 3 == 0) {
                    result = result.concat("Fizz\n");
                } else if (index % 5 == 0) {
                    result = result.concat("Buzz\n");
                }
                else{
                    result = result.concat(index + "\n");
                }
            }
        }
        return result;
    }
}
