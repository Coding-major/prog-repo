public class Test {
    public static void main(String[] args) {
        // System.out.println("hello world");
        System.out.println("me and you");
        // System.out.println(args[1]);
        System.out.println("are they okay");
        System.out.print("what do you think");
        System.out.println(" you can achieve");
        System.out.print("okayna");
        /*
         * this is a java multiple line
         * comment if you like believe it or not
         */
        String name = "mustapha";
        System.out.println(name);

        int x = 5, y = 10;
        byte me = 126; /*
                        * to save memory if you are sure the
                        * range is within -128 and 127.
                        */
        short snum = 32767; // for number within the range of -32767 and 32767
        long bignumber = 299999999; // range of -2147483648 and 2147483648
        float z = 20f; // is smaller and can only take six numbers before the decimal point
        double r = 30d; // is bigger and can take 15 numbers before the decimal point
        char musty = 'y';
        boolean damn = true;
        System.out.println(x + y + z);

        // example of floating points
        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);

        int g, h, i;
        g = 2;
        h = 3;
        i = 7;
        System.out.println(g + h - i);

        String txt = "boy\bg me";
        String tyt = "boknky\rg me";
        System.out.println(tyt);
        int b = Math.max(3, 4);
        System.out.println(b);
        int oh = (int) (Math.random() * 100) + 90;
        System.out.println(oh);

        int pp = 12;
        int yy = 5;
        boolean bool = pp > yy;
        System.out.println(bool);

        int number = 11;
        if (number < 0 || number > 10) {
            System.out.println("not in the range");
        } else {
            System.out.println("you are good to go");
        }

        String day = "jjj";
        switch (day) {
            case "jjsj":
                System.out.println("Monday");
                break;
            case "jdjj":
                System.out.println("Tuesday");
                break;
            case "kjhf":
                System.out.println("Wednesday");
                break;
            case "jujj":
                System.out.println("Thursday");
                break;
            case "jjkj":
                System.out.println("Friday");
                break;
            case "jjj":
                System.out.println("Saturday");
                break;
            case "jjjll":
                System.out.println("Sunday");
                break; // a break saves a lot of execution time though not nessecary to use it but very
                       // good to use
            default: // default is code that run if ther is no case match
                System.out.println("happy weekend");

        }

        int t = 1;
        while (t < 5) {
            System.out.println(t);
            t++;
        }

        int fan = 1;
        do {
            System.out.println(fan);
            fan++;
        } while (fan < 5);

        for (int f = 1; f < 5; f++) {
            System.out.println(f);
        }

    }
}