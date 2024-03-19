package arief.mahendra.test;

public class Calculator {
    public Integer divide(Integer firstNum, Integer secondNum){
        if (firstNum == 0){
            throw new IllegalArgumentException("cannot divide by zero");
        } else {
            return firstNum / secondNum;
        }
    }

    public Integer add(Integer firstNum, Integer secondNum){
        return firstNum + secondNum;
    }
}
