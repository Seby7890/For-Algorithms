import java.util.Arrays;
import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        showNumbersAscend();                      //1
        showNumbersDescend();                     //2
        computeSum();                             //3
        showNumbers();                            //4
        showEvenNumbers();                        //5
        showFactorial();                          //6
        showPattern1();                           //7
        showPattern2();                           //8
        computeAverage();                         //9
        isDivisible();                            //10
        isPrime();                                //11
        showSmallestAndBiggestNumber();           //12
        countOddAndEvenNumbers();                 //13
        reverseArray();                           //14
        showCorrectAnswers();                     //15
        computeProduct();                         //16
        sortArrayAscend();                        //17
        addNumber();                              //18
        isPalindrome();                           //19
        countChar();                              //20
        showEvenLengthStrings();                  //21
        changeFirstLetter();                      //22
        reverseString();                          //23
    }

    //1. Display numbers in a specified interval (ascend)
    static void showNumbersAscend() {
        System.out.println("Count has begun...");

        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Count has ended!");
    }

    //2. Display numbers in a specified interval (descend)
    static void showNumbersDescend() {
        System.out.println("Count has begun...");

        for (int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Count has ended!");
    }

    //3. Display sum of numbers in a specified interval
    static void computeSum() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter first number of interval = ");
        int a = console.nextInt();
        System.out.print("Enter last number of interval = ");
        int b = console.nextInt();
        int sum = 0;

        for (; a <= b; a++) {
            sum = sum + a;
        }

        System.out.println("Sum is: " + sum);
    }

    //4. Display every second number in a specified interval
    static void showNumbers() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter first number of interval = ");
        int a = console.nextInt();
        System.out.print("Enter last number of interval = ");
        int b = console.nextInt();

        for (; a <= b; a += 2) {
            System.out.print(a + " ");
        }

        System.out.println();
    }

    //5. Display even numbers from 1 to 30
    static void showEvenNumbers() {
        System.out.println("The numbers are: ");

        for (int i = 0; i <= 30; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println();
    }

    //6. Factorial
    static void showFactorial() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int n = console.nextInt();
        double prod = 1;

        for (int i = 1; i <= n; i++) {
            prod = prod * i;
        }

        System.out.println("Result for factorial is: " + prod);
    }

    //7. Display a rectangle with the symbol '#' depending on the width and length entered
    static void showPattern1() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter width = ");
        int width = console.nextInt();
        System.out.print("Enter height = ");
        int height = console.nextInt();

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    //8. Display a pattern with the '&' symbol in length and width depending on the number entered
    static void showPattern2() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int n = console.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % 2 == 0) {
                    System.out.print("&" + " ");
                } else {
                    System.out.print(" &");
                }
            }
            System.out.println();
        }
    }

    //9. Count average of consecutive numbers in a specified interval
    static void computeAverage() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter first number of interval = ");
        int a = console.nextInt();
        System.out.print("Enter last number of interval = ");
        int b = console.nextInt();
        int sum = 0;
        int average;

        for (int i = a; i <= b; i++) {
            sum = sum + i;
        }

        average = sum / (b - a + 1);

        System.out.println("Average count is: " + average);
    }

    //10. Display numbers divisible by 3 and 7 at the same time in a specified interval
    static void isDivisible() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter first number of interval = ");
        int x = console.nextInt();
        System.out.print("Enter last number of interval = ");
        int y = console.nextInt();
        System.out.println("Numbers are: ");

        for (; x <= y; x++) {
            if ((x % 3 == 0) && (x % 7 == 0)) {
                System.out.print(x + " ");
            }
        }
    }

    //11. Check if a number is prime
    static void isPrime() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number to check if it's prime or not = ");
        int number = console.nextInt();
        boolean isPrime = true;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                System.out.println(number + " is not a prime number.");
                break;
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        }
    }

    //12. Display the biggest and smallest number in an array
    static void showSmallestAndBiggestNumber() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter number of elements in array = ");
        int size = console.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element of array = ");
            numbers[i] = console.nextInt();
        }

        System.out.println("Array is: " + Arrays.toString(numbers));

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            } else if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println(min + " is the smallest number.");
        System.out.println(max + " is the biggest number.");
    }

    //13. Count how many even and odd numbers are in an array
    static void countOddAndEvenNumbers() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter number of elements in array = ");
        int size = console.nextInt();
        int[] numbers = new int[size];
        int even = 0;
        int odd = 0;

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element of array = ");
            numbers[i] = console.nextInt();
        }

        System.out.println("Array is: " + Arrays.toString(numbers));

        for (int number : numbers) {
            if (number % 2 == 0) {
                even = even + 1;
            } else {
                odd = odd + 1;
            }
        }

        System.out.println("There are " + even + " even numbers.");
        System.out.println("There are " + odd + " odd numbers.");
    }

    //14. Reverse elements of an array
    static void reverseArray() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter number of elements in array = ");
        int size = console.nextInt();
        int[] numbers = new int[size];
        int[] reversedNumbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element of array = ");
            numbers[i] = console.nextInt();
        }

        System.out.println("Original array is: " + Arrays.toString(numbers));

        for (int i = numbers.length - 1; i >= 0; i--) {
            reversedNumbers[numbers.length - 1 - i] = numbers[i];
        }

        System.out.println("Reversed array is: " + Arrays.toString(reversedNumbers));
    }

    //15. Checking the number of correct answers given by the user, having a list of correct answers
    static void showCorrectAnswers() {
        char[] correctAnswers = {'C', 'A', 'B', 'A', 'B'};
        char[] usersAnswers = {'C', 'B', 'B', 'C', 'B'};
        int compareAnswers = 0;

        for (char correctAnswer : correctAnswers) {
            for (char usersAnswer : usersAnswers) {
                if (correctAnswer == usersAnswer) {
                    compareAnswers++;
                    break;
                }
            }
        }

        System.out.println("You have " + compareAnswers + " correct answers.");
    }

    //16. Display the product of each 2 consecutive numbers in the array
    static void computeProduct() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter number of elements in array = ");
        int size = console.nextInt();
        int[] numbers = new int[size];
        int prod;

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element of array = ");
            numbers[i] = console.nextInt();
        }

        System.out.println("Original array is: " + Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i += 2) {
            if (i < numbers.length - 1) {
                prod = numbers[i] * numbers[i + 1];
                numbers[i]++;
            } else {
                prod = numbers[i];
            }

            System.out.println("Product is: " + prod);
        }
    }

    //17. Sort an array (ascend)
    static void sortArrayAscend() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter number of elements in array = ");
        int size = console.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element of array = ");
            numbers[i] = console.nextInt();
        }

        System.out.println("Original array is: " + Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            Arrays.sort(numbers);
        }

        System.out.println("Sorted array is: " + Arrays.toString(numbers));
    }

    //18. Adding an element to each element in an array
    static void addNumber() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter number of elements in array = ");
        int size = console.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element of array = ");
            numbers[i] = console.nextInt();
        }

        System.out.println("Original array is: " + Arrays.toString(numbers));
        System.out.print("Enter a number to add to each element of the array = ");

        int number = console.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] + number;
        }

        System.out.println("New arrays is: " + Arrays.toString(numbers));
    }

    //19. Display if a String is palindrome or not
    static void isPalindrome() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a string = ");
        String word = console.nextLine();
        String reverse = "";
        word = word.toLowerCase();

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }

        System.out.println(word.equals(reverse));
    }

    //20. Display how many letters, digits, spaces and characters are in a String
    static void countChar() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a String = ");
        String sentence = console.nextLine();
        int letters = 0;
        int digits = 0;
        int spaces = 0;
        int characters = 0;

        for (int i = 0; i <= sentence.length() - 1; i++) {
            if (Character.isLetter(sentence.charAt(i))) {
                letters++;
            } else if (Character.isDigit(sentence.charAt(i))) {
                digits++;
            } else if (Character.isWhitespace(sentence.charAt(i))) {
                spaces++;
            } else {
                characters++;
            }
        }

        System.out.println("There are " + letters + " letters, " + digits + " digits, " + spaces + " spaces and " + characters + " characters");
    }

    //21. Display Strings of even lengths from an array of Strings
    static void showEvenLengthStrings() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the number of elements = ");
        int size = console.nextInt();
        String[] input = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the elements of the array = ");
            String userInput = console.next();
            input[i] = userInput;
        }

        System.out.println("Original array is: " + Arrays.toString(input));
        System.out.print("Even length elements are: ");

        for (int i = 0; i < size; i++) {
            if (input[i].length() % 2 == 0) {
                System.out.print(input[i] + " ");
            }
        }
    }

    //22. Convert the first letter of each word in a String to uppercase
    static void changeFirstLetter() {
        Scanner console = new Scanner(System.in);
        System.out.print("Original string = ");
        String string = console.nextLine();
        char[] charArray = string.toCharArray();
        boolean foundSpace = true;

        for (int i = 0; i < charArray.length; i++) {
            if (Character.isLetter(charArray[i])) {
                if (foundSpace) {
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            } else {
                foundSpace = true;
            }
        }

        string = String.valueOf(charArray);

        System.out.println("New string = " + string);
    }

    //23. Reverse words in a String
    static void reverseString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Original string = ");
        String string = scanner.nextLine();
        String[] words = string.split("\\s");
        String reversedString = "";

        for (int i = 0; i < words.length; i++) {
            if (i == words.length - 1)
                reversedString = words[i] + reversedString;
            else reversedString = " " + words[i] + reversedString;
        }

        System.out.println("Reversed string = " + reversedString);
    }
}
