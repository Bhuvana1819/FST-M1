package activities;

public class Activity2 {

    public static void main (String[] args) {
        int[] randomnumbers = {10, 77, 10, 54, -11, 10};

        int searchnum = 10;
        int fixednum = 30;

        System.out.println("Results :" + result(randomnumbers, searchnum, fixednum));
    }
        public static boolean result (int[] randomnumbers,int searchnum,int fixednum)

        {
            int x = 0;
            for (int y : randomnumbers)
            {
                if (y == searchnum ){
                    x += searchnum;
                }
                if (x > fixednum) {
                    break;
                }
            }
            return x==fixednum;
        }

    }

