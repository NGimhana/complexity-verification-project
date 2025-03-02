package cog_complexity_validation_datasets.One;

import java.util.Arrays;

/**
 * Note: method names were changed from 'main' to main + their task number
 *       this allows the code to be compiled and analyzed by sonarqube
 */
public class Tasks {

    //ADDED BY KOBI
    @SuppressWarnings("all")
    public static void runAllSnippets() {
        main1(new String[2]);
        main2(new String[2]);
        main3(8, 17);
        main4(new String[2]);
        main5(new String[2]);
        main6(new String[2]);
        main7(new String[2]);
        main8(new String[2]);
        main9(new String[2]);
        main10(new String[2]);
        main11(new String[2]);
        main12(new String[2]);
        main13(new String[2]);
        main14(new String[2]);
        main15(new String[2]);
        main16(new String[2]);
        main17(new String[2]);
        main18(new String[2]);
        main19(new String[2]);
        main20(new String[2]);
        main21(new String[2]);
        main22(new String[2]);
        main23(new String[2]);
    }

    /*REORDERED THE METHODS*/

    // 1. Faculty (Factorial)                                        /*Tasks for fMRI-Setting*/
    //SNIPPET_STARTS    DATASET2START
    public static void main1(String[] args) {
        int result = 1;
        int x = 4;

        while (x > 1) {
            result = result * x;
            x--;
        }
        System.out.println(result);
    }
    //DATASET2END

    // 2. Count same chars at same positions in String              /*First and second pilot study*/
    //SNIPPET_STARTS    DATASET2START
    public static void main2(String[] args) {
        String string1 = "Magdeburg";
        String string2 = "Hamburg";

        int length;
        if (string1.length() < string2.length())
            length = string1.length();
        else length = string2.length();
        
        int counter=0;
        
        for (int i = 0; i < length; i++) {
            if (string1.charAt(i) == string2.charAt(i)) {
                counter++;
            }
        }
        System.out.println(counter);
    }
    //DATASET2END

    // 3. Greatest common divisor                                               /*Only in the first pilot study*/
    // Note: To allow compilation, number1 and number2 had to be defined
    //SNIPPET_STARTS
    public static void main3(int number1, int number2) {
        int temp; // Note: a ";" had to be added here to allow compilation
        do {
            if (number1 < number2) {
                temp = number1;
                number1 = number2;
                number2 = temp;
            }
            temp = number1 % number2;
            if (temp != 0) {
                number1 = number2;
                number2 = temp;
            }
        } while (temp != 0);
        System.out.println(number2);
    }

    // 4. BubbleSort                                                        /*Only in the first pilot study*/
    //SNIPPET_STARTS
    public static void main4(String[] args) {
        int array[] = {14,5,7};
        for (int counter1 = 0; counter1 < array.length; counter1++) {
            for (int counter2 = counter1; counter2 > 0; counter2--) {
                if (array[counter2 - 1] > array[counter2]) {
                    int variable1 = array[counter2];
                    array[counter2] = array[counter2 - 1];
                    array[counter2 - 1] = variable1;
                }
            }
        }

        for (int counter3 = 0; counter3 < array.length; counter3++)
            System.out.println(array[counter3]);
    }

    // 5. Binary search                                     /*Only in the first pilot study*/
    //SNIPPET_STARTS
    public static void main5(String[] args) {
        int array[] = { 2, 4, 5, 6, 8, 10, 13 };
        int key = 5;
        int index1 = 0;
        int index2 = array.length - 1;
        while (index1 <= index2) {
            int m = (index1 + index2) / 2;
            if (key < array[m])
                index2 = m - 1;
            else if (key > array[m])
                index1 = m + 1;
            else {
                System.out.println(m);
                break;
            }
        }
    }

    // 6. Sum from 1 to n                                                          /*First and second pilot study*/
    //SNIPPET_STARTS
    public static void main6 (String[] args) {
        int n = 4; // Note: a ";" had to be added here to allow compilation
        int result = 0;
        for (int i = 1; i <= n; i++)
            result = result + i;
        System.out.println(result);
    }

    // 7. Find max in list of numbers                                           /*Tasks for fMRI-Setting*/
    //SNIPPET_STARTS    DATASET2START
    public static void main7 (String[] args) {
        int array[] = {2, 19, 5, 17};
        int result = array[0];
        for (int i = 1; i < array.length; i++)
            if (array[i] > result)
                result = array[i];
        System.out.println(result);
    }
    //DATASET2END

    // 8. Cross sum                                                         /*Tasks for fMRI-Setting*/
    //SNIPPET_STARTS    DATASET2START
    public static void main8(String[] args) {
        int number = 323;
        int result = 0;

        while (number!= 0) {
            result = result + number % 10;
            number = number / 10;
        }
        System.out.println(result);
    }
    //DATASET2END

    // 9. Prime test                                                       /*Tasks for fMRI-Setting*/
    //SNIPPET_STARTS
    public static void main9(String[] args){
        int number = 11;
        boolean result = true;
        for(int i = 2; i < number; i++) {
            if(number % i == 0) {
                result = false;
                break;
            }
        }
        System.out.println(result);
    }

    // 10. Find largest number of three numbers                                      /*Tasks for fMRI-Setting*/
    //SNIPPET_STARTS    DATASET2START
    public static void main10(String[] args) {
        int num1 = 5;
        int num2 = 3;
        int num3 = 10;

        if (num1 > num2 && num1 > num3)
            System.out.println(num1);
        else if (num2 > num1 && num2 > num3)
            System.out.println(num2);
        else if (num3 > num1 && num3 > num2)
            System.out.println(num3);
    }
    //DATASET2END

    // 11. Power                                                                /*Tasks for fMRI-Setting*/
    //SNIPPET_STARTS    DATASET2START
    public static void main11(String[] args) {
        int num1 = 2;
        int num2 = 3;
        int result = num1;
        for (int i = 1; i < num2; i++) {
            result = result * num1;
        }
        System.out.println(result);
    }
    //DATASET2END

    // 12. Check palindrom                                          /*First and second pilot study*/
    //SNIPPET_STARTS
    public static void main12(String[] args) {
        String word = "otto";
        boolean result = true;
        for (int i = 0, j = word.length() - 1; i < word.length()/2; i++, // Note: "int" before j had to be removed to allow compilation
            j--) {
            if (word.charAt(i) != word.charAt(j)) {
                result = false;
                break;
            }
        }
        System.out.println(result);
    }

    // 13. Swap                                                             /*Tasks for fMRI-Setting*/
    //SNIPPET_STARTS    DATASET2START
    public static void main13(String[] args) {
        int var1 = 23;
        int var2 = 42;
        int temp;
        temp = var1;
        var1 = var2;
        var2 = temp;
        System.out.println(var1);
    }
    //DATASET2END

    // 14. Reverse string                                                       /*Tasks for fMRI-Setting*/
    //SNIPPET_STARTS    DATASET2START
    public static void main14(String[] args) {
        String word = "Hello";
        String result = new String();

        for ( int j = word.length() - 1; j >= 0; j-- )
            result += word.charAt(j);
        
        System.out.println(word);
    }
    //DATASET2END

    // 15. Matrix multiplication                                    /*Only in the first pilot study*/
    //SNIPPET_STARTS
    public static void main15(String[] args) {
        int array[][] = {{5,6,7},{4,8,9}};
        int array1[][] = {{6,4},{5,7},{1,1}};
        int array2[][] = new int[3][3];

        int x = array.length;
        int y = array1.length;

        for(int i = 0; i < x; i++) {
            for(int j = 0; j < y-1; j++) {
                for(int k = 0; k < y; k++){
                    array2[i][j] += array[i][k]*array1[k][j];
                }
            }
        }

        for(int i = 0; i < x; i++) {
            for(int j = 0; j < y-1; j++) {
                System.out.print(" "+array2[i][j]);
            }
        }
    }

    // 16. Arithmetic mean                                  /*Only in the first pilot study*/
    //SNIPPET_STARTS
    public static void main16(String[] args) {
        int a = 4;
        int b = 8;
        int result = (a + b) / 2;
        System.out.println(result);
    }

    // 17. Check whether substring is contained                                             /*Tasks for fMRI-Setting*/
    //SNIPPET_STARTS    DATASET2START
    public static void main17(String[] args) {
        String word = "Programming in Java";
        String key1 = "Java";
        String key2 = "Pascal";

        int index1 = word.indexOf(key1);
        int index2 = word.indexOf(key2);

        if (index1 != -1)
            System.out.println("Substring is contained: " + key1);
        else
            System.out.println("Substring is not contained: " + key1);
        if (index2 != -1)
            System.out.println("Substring is contained: " + key2);
        else
            System.out.println("Substring is not contained: " + key2);
    }
    //DATASET2END

    // 18. Least common multiple                                /*Only in the first pilot study*/
    //SNIPPET_STARTS
    public static void main18(String[] args) {
        int number1 = 23;
        int number2 = 42;

        int max, min;
        int results = -1; // Note: a ";" had to be added here to allow compilation

        if (number1>number2) {
            max = number1; min = number2;
        } else {
            max = number2; min = number1;
        }
        for(int i=1; i<=min; i++) {
            if( (max*i)%min == 0 ) {
                results = i*max; break; // Note: result had to be renamed to results to allow compilation
            }
        }
        if(results != -1) // Note: result had to be renamed to results to allow compilation
            System.out.println(results);
        else
            System.out.println("Error!");
    }

    // 19. Capitalize first letter of word                          /*Only in the first pilot study*/
    //SNIPPET_STARTS
    public static void main19(String[] args) {
        String s = "here are a bunch of words";

        final StringBuilder result = new StringBuilder(s.length());

        String[] words = s.split("\\s");
        for(int i=0,l=words.length;i<l;++i) {
            if(i>0) result.append(" ");
            result.append(Character.toUpperCase(words[i].charAt(0)))
                .append(words[i].substring(1)); // Note: a ")" had to be added here to allow compilation
        }
        System.out.println(result);
    }

    // 20. Decimal to binary                                                                /*Tasks for fMRI-Setting*/
    //SNIPPET_STARTS    DATASET2START
    public static void main20(String[] args) {
        int i=14;
        String result="";

        while (i>0) {
            if (i%2 ==0)
                result="0"+result;
            else
                result="1"+result;
                i=i/2;
        }

        System.out.println(result); }
    //DATASET2END
    
    // 21. Reverse entries of array                                                 /*Tasks for fMRI-Setting*/
    //SNIPPET_STARTS    DATASET2START
    public static void main21(String[] args) {
        int[] array = { 1, 6, 4, 10, 2 };

        for (int i = 0; i <= array.length/2-1; i++){
            int tmp=array[array.length-i-1];
            array[array.length-i-1] = array[i];
            array[i]=tmp;
        }

        for (int i = 0; i <= array.length - 1; i++) { // Note a "{" had to be added here to allow compilation
            System.out.println(array[i]);
        }
    }
    //DATASET2END

    // 22. Median on sorted data                                                /*Tasks for fMRI-Setting*/
    //SNIPPET_STARTS    DATASET2START
    public static void main22(String[] args) {
        int[] array={1,2,4,5,6,10};

        Arrays.sort(array); // Note: this line had to me changed to allow compilation

        float b;
        if (array.length % 2==1)
            b=array[array.length /2];
        else
            b=(array[array.length/2-1]+array[array.length/2])/2f;
        
        System.out.println(b);
    }
    //DATASET2END

    // 23. Double entries of array                              /*First and second pilot study*/
    //SNIPPET_STARTS
    public static void main23(String[] args) {
        int[] array = { 1, 3, 11, 7, 4 };

        for (int i = 0; i < array.length; i++)
            array[i] = array[i] * 2;

        for (int i = 0; i <= array.length - 1; i++)
        System.out.println(array[i]);
    }
    //SNIPPETS_END
}