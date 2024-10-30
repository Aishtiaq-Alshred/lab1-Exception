import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        solution1(input);
        solution2(input);
        solution3(input);
        solution4(input);
        solution5(input);
        solution6(input);
        solution7(input);
        solution8(input);
        solution9(input);
        solution10(input);
        solution11(input);
        solution12(input);
        solution13(input);
        solution14(input);
        solution15(input);
        solution16(input);
        solution17(input);
        solution18(input);


        //هذي الطريقه تختصر كثير ولكن المشكله اذا جاء ايرور يطلعني مايمر على الباقي عكس لما تكون كل ميثود لها تراي منفصله
//        try {
//            solution1(input);
//            solution2(input);
//            solution3(input);
//            solution4(input);
//            solution5(input);
//            solution6(input);
//            solution7(input);
//            solution8(input);
//            solution9(input);
//            solution10(input);
//            solution11(input);
//            solution12(input);
//            solution13(input);
//            solution14(input);
//            solution15(input);
//            solution16(input);
//            solution17(input);
//            solution18(input);
//
//        } catch (InputMismatchException e) {
//            System.out.println("Error: Please enter numbers only.");
//        } catch (ArithmeticException e) {
//            System.out.println("Error: A calculation problem occurred, please check the operations.");
//        } catch (Exception e) {
//            System.out.println("Unexpected error: An unknown problem occurred. Please try again.");
//        }
    }

    public static void solution1(Scanner input)  {
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
        System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
        System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));

        try {
            System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
            System.out.println(number1 + " mod " + number2 + " = " + (number1 % number2));
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide or modulo by zero.");
        }
    }

    public static void solution2(Scanner input) throws InputMismatchException {
        try {
            System.out.println("Enter a number to display its multiplication table:");
            int num = input.nextInt();
            if (num == 0) {
                throw new InputMismatchException("Error: The number must be greater than zero for the multiplication table.");
            }

            for (int i = 1; i <= 10; i++) {
                int multiplication = num * i;
                System.out.println(num + " * " + i + " = " + multiplication);
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter only integer numbers for the multiplication table");
        }
    }




    public static void solution3(Scanner input) {
        try {
            System.out.print("Enter the radius of the circle: ");
            double radius = input.nextDouble();

            double area = Math.PI * radius * radius;
            double perimeter = 2 * Math.PI * radius;

            System.out.println("Perimeter is: " + perimeter);
            System.out.println("Area is: " + area);

        }catch (InputMismatchException e){
            System.out.println("Error: Please enter a valid number for the radius of the circle.");
        }

    }

    public static void solution4(Scanner input)  {
        try{
        System.out.println("Enter the count of numbers:");
        int count = input.nextInt();

        double sum = 0;
        for (int i = 0; i < count; i++) {
            System.out.print("Enter an integer: ");
            int num = input.nextInt();
            sum += num;


        double average = sum / count;
        System.out.println("The average is: " + average);}
    } catch (InputMismatchException e){
            System.out.println("Error: Please enter valid numbers to calculate the average.");}
    }


    public static void solution5(Scanner input)  {
        try{
        System.out.println("Input the first number:");
        int number1 = input.nextInt();
        System.out.println("Input the second number:");
        int number2 = input.nextInt();
        System.out.println("Input the third number:");
        int number3 = input.nextInt();

        boolean result = (number1 + number2 == number3);
        System.out.println("The result is: " + result);} catch (InputMismatchException e){
            System.out.println("Error:Please enter number only");
        }
    }

    public static void solution6(Scanner input) {
        try {
            input.nextLine(); // لتجنب مشاكل الإدخال بعد الأرقام
            System.out.println("Input a word:");
            String word = input.nextLine();
            StringBuilder reverse = new StringBuilder(word).reverse();
            System.out.println("Reverse word: " + reverse);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void solution7(Scanner input) throws InputMismatchException {
        try {
            System.out.println("Enter a number:");
            int number = input.nextInt();

            if (number % 2 == 0) {
                System.out.println("The number is Even");
            } else {
                System.out.println("The number is Odd");
            }
            if(number == 0){ throw new InputMismatchException("Error: The number must be greater than zero for the multiplication table.");

            }
        } catch (InputMismatchException e) {
            System.out.println("Error:Please enter number only");
        }

    }

    public static void solution8(Scanner input)  {
        try {


            System.out.print("Enter temperature in Centigrade:");
            double celsius = input.nextDouble();

            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit is: " + fahrenheit);

    }catch (InputMismatchException e){
            System.out.println("Error:Please enter number only");
        }
    }

    public static void solution9(Scanner input) {
        try {
        input.nextLine(); // لتجنب مشاكل الإدخال
        System.out.println("Input a string:");
        String str = input.nextLine();
        System.out.println("Input a number:");

            int index = input.nextInt();
            if (index >= 0 && index < str.length()) {
                System.out.println("The character at index " + index + " is: " + str.charAt(index));
            } else {
                System.out.println("Invalid index.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }



    public static void solution10(Scanner input)  {
        input.nextLine();
        System.out.println("Width:");
        try{
        double width = input.nextDouble();
        System.out.println("Height:");
        double height = input.nextDouble();

        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.println("Area is " + area);
        System.out.println("Perimeter is " + perimeter);}
        catch (InputMismatchException e){
            System.out.println("Error:Please enter number only");
        }
    }

    public static void solution11(Scanner input)  {
        input.nextLine();
        try{
        System.out.println("Input first integer:");
        int num1 = input.nextInt();
        System.out.println("Input second integer:");
        int num2 = input.nextInt();

        System.out.println(num1 + (num1 != num2 ? " != " : " == ") + num2);
        if (num1 < num2) System.out.println(num1 + " < " + num2);}
        catch (InputMismatchException e){
            System.out.println("Error:Please enter number only");
        }
    }

    public static void solution12(Scanner input)  {
        input.nextLine();
        try{
        System.out.print("Input seconds:");
        int totalSeconds = input.nextInt();

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.println(hours + ":" + minutes + ":" + seconds);}
        catch (InputMismatchException e){
            System.out.println("Error:Please enter number only");
        }
    }

    public static void solution13(Scanner input)  {
        input.nextLine();
        try{
        int[] numbers = new int[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Input number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        boolean allEqual = (numbers[0] == numbers[1] && numbers[1] == numbers[2] && numbers[2] == numbers[3]);
        System.out.println(allEqual ? "Numbers are equal!" : "Numbers are not equal!");}
            catch(InputMismatchException e){
                System.out.println("Error:Please enter number only");
            }


    }

    public static void solution14(Scanner input)  {
        input.nextLine();
        try{
        System.out.println("Enter a number:");
        int number = input.nextInt();

        if (number > 0) System.out.println("Number is positive");
        else if (number < 0) System.out.println("Number is negative");
        else System.out.println("Number is zero");}
        catch(InputMismatchException e){
            System.out.println("Error:Please enter number only");
        }
    }

    public static void solution15(Scanner input)  {
        input.nextLine();
        try{
        int positiveCount = 0, negativeCount = 0, zeroCount = 0, num;

        do {
            System.out.print("Enter a number (enter -1 to quit): ");
            num = input.nextInt();
            if (num > 0) positiveCount++;
            else if (num < 0) negativeCount++;
            else zeroCount++;
        } while (num != -1);

        System.out.println("Positives: " + positiveCount);
        System.out.println("Negatives: " + negativeCount);
        System.out.println("Zeros: " + zeroCount); }
        catch(InputMismatchException e){
            System.out.println("Error:Please enter number only");
        }
    }

    public static void solution16(Scanner input)  {
        input.nextLine();
        try{
        System.out.print("Enter an integer:");
        int number = input.nextInt();
        int reversed = 0;

        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }

        System.out.println("Reversed number: " + reversed);}catch(InputMismatchException e){
            System.out.println("Error:Please enter number only");
        }
    }

    public static void solution17(Scanner input)  {
        input.nextLine();
        try{
        System.out.println("Enter the count of numbers:");
        int count = input.nextInt();

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < count; i++) {
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            if (num > largest) largest = num;
            if (num < smallest) smallest = num;
        }

        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);}catch(InputMismatchException e){
            System.out.println("Error:Please enter number only");
        }
    }

    public static void solution18(Scanner input) {
        input.nextLine();
        try{
        input.nextLine(); // للتأكد من أن القراءة سليمة
        System.out.print("Enter a string:");
        String str = input.nextLine();

        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'A') count++;
        }

        System.out.println("Number of 'a's: " + count);} catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


