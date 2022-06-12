import java.util.List;

public class main {
    public static void main(String[] args) {
//        FizzBuzz fizzBuzz = new FizzBuzz();
//
//        System.out.println(fizzBuzz.fizzBuzz(100));

        SingleNumber singleNumber = new SingleNumber();
        System.out.println(singleNumber.SingleNumber(new int[]{1, 2, 2, 3, 3}));
        System.out.println(singleNumber.SingleNumber(new int[]{1, 1, 2, 4, 4}));
        System.out.println(singleNumber.SingleNumber(new int[]{2, 2, 5, 5, 1}));
    }
}
