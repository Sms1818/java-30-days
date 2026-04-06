public class Loops {
    public static void main(String[] args) {
        // Because of semi colon at the end of for loop, the loop body is empty and the statement inside the block will execute only once after the loop ends. This is a common mistake that can lead to unexpected behavior in the code.
        for (int i = 0; i < 5; i++); 
        {
            System.out.println("Loop ended");
        }

        // In this case, the break statement will exit the loop when i is equal to 2, so the output will be "0 1 " and then the loop will terminate. The numbers 3 and 4 will not be printed because the loop has already been exited.
        for (int i = 0; i < 5; i++) {
            if (i == 2)
                break;
            System.out.print(i + " ");
        }
        System.out.println();

        // In this case, the continue statement will skip the current iteration of the loop when i is equal to 2, so the output will be "0 1 3 4 ". The number 2 will not be printed because the loop will skip that iteration and move on to the next one.
        for (int i = 0; i < 5; i++) {
            if (i == 2)
                continue;
            System.out.print(i + " ");
        }
        System.out.println();

        // In this case, the while loop will execute as long as the condition i < 5 is true. The variable i is initialized to 0, and in each iteration of the loop, it will print the current value of i followed by a space, and then increment i by 1. Once i reaches 5, the condition will become false and the loop will terminate. The output will be "0 1 2 3 4 ".
        int i = 0;
        while (i < 5) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        // In this case, the do-while loop will execute at least once, even if the condition is false. The variable j is initialized to 0, and the loop will print the value of j followed by a space, and then increment j by 1. After the first iteration, j will be 1, and the condition j < 0 will be false, so the loop will terminate. The output will be "0 ".
        int j = 0;
        do {
            System.out.print(j + " ");
            j++;
        } while (j < 0);
        System.out.println();

        // In this case, the for loop will execute 5 times, but the variable k is incremented twice in each iteration (once in the loop header and once inside the loop body). This means that k will take on the values 1, 3, 5, 7, and 9 during the iterations. The output will be "1 3 5 7 9 ".
        for (int k = 0; k < 5; k++) {
            k++;
            System.out.print(k + " ");
        }
        System.out.println();

        // In this case, the while loop will execute as long as the condition m < 5 is true. The variable m is initialized to 0, and in each iteration of the loop, it will check if m is equal to 2. If m is equal to 2, it will increment m by 1 and skip the rest of the loop body using the continue statement. Otherwise, it will print the current value of m followed by a space, and then increment m by 1. The output will be "0 1 3 4 ".
        int m = 0;
        while (m < 5) {
            if (m == 2) {
                m++;
                continue;
            }
            System.out.print(m + " ");
            m++;
        }
        System.out.println();

        // In this case, the nested for loops will iterate through the values of x from 1 to 3 and y from 1 to 2. For each combination of x and y, it will print the concatenated string of x and y followed by a space. The output will be "11 12 21 22 31 32 ".
        for (int x = 1; x <= 3; x++) {
            for (int y = 1; y <= 2; y++) {
                System.out.print(x + "" + y + " ");
            }
        }
        System.out.println();

        // In this case, the while loop will execute as long as the condition n < 3 is true. The variable n is initialized to 0, and in each iteration of the loop, it will print the current value of n followed by a space, and then increment n by 1 using the post-increment operator. Once n reaches 3, the condition will become false and the loop will terminate. The output will be "0 1 2 ".
        int n = 0;
        while (n < 3)
            System.out.print(n++);
        System.out.println();

        // In this case, the while loop will execute as long as the condition p < 3 is true. However, since the variable p is initialized to 0 and is never incremented within the loop, the condition will always be true, resulting in an infinite loop. The output will continuously print "0" without stopping.
        int p = 0;
        while (p < 3) {
            System.out.print(p);
        }


    }
    
}
