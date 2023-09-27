package fa.training.problem01;

public class FizzBuzz {
    public String fizzBuzz(Integer inputValue){
        if((inputValue % 5==0) && (inputValue %3 ==0))
        {
            return "FizzBuzz";
        }
       else if(inputValue % 3 == 0 ){
                return "Fizz";
        }else if(inputValue %5 ==0){
               return "Buzz";
        }
       else {
           return inputValue.toString();
       }
    }

    public static void main(String[] args) {
    }
}
