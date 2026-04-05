class DecisionMaking{

    public static void main(String[] args) {

        int a = 10, b = 20;
        if (a > 5)
            if (b > 25)
                System.out.println("A");
            else
                System.out.println("B");

        int x = 5;
        if (x > 0)
            System.out.println("Positive");
        System.out.println("Always executes");

        int y = 0;
        if (y == 0)
            System.out.println("Correct comparison");

        int m = 5;
        if (m > 10 && ++m > 6)
            System.out.println("Inside if");
        System.out.println("m value: " + m);

        int n = 5;
        if (n < 10 || ++n > 6)
            System.out.println("Condition true");
        System.out.println("n value: " + n);

        int p = 10;
        if (p > 5)
            if (p < 15)
                System.out.println("Between 5 and 15");

        int num = 20;
        if (num > 10)
            System.out.println("Greater than 10");
        else if (num > 15)
            System.out.println("Greater than 15");

        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Mon");
            case 2:
                System.out.println("Tue");
            case 3:
                System.out.println("Wed");
                break;
            default:
                System.out.println("Other");
        }

        char ch = 'A';
        switch (ch) {
            case 'A':
                System.out.println("Grade A");
                break;
            default:
                System.out.println("Other Grade");
        }

        int r = 10, s = 20, t = 30;
        int max = (r > s) ? (r > t ? r : t) : (s > t ? s : t);
        System.out.println("Max: " + max);

        int z = 0;
        if (z != 0 && 10 / z > 1)
            System.out.println("Will not execute");
        else
            System.out.println("Safe from divide by zero");

        boolean flag = false;
        if (flag == true)
            System.out.println("True");
        else
            System.out.println("False");

        int k = 5;
        if (k > 2 && k < 10 && k != 7)
            System.out.println("Valid range");

        int val = 1;
        switch (val) {
            default:
                System.out.println("Default");
            case 1:
                System.out.println("One");
            case 2:
                System.out.println("Two");
        }

        int age = 18;
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println(result);
    }
}