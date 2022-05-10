package activities;
abstract class book{
    String title;
    abstract void settitle(String s);
    String gettitle() { return title; }
}
 class mybook extends book {
    public void settitle(String S) {
        title = S;
    }
}
public class Activity5 {

         public static void main (String []args) {
        String title = "Welcome";
        book newnovel = new mybook();

        newnovel.settitle(title);
        System.out.println("Novel name is " + newnovel.gettitle());
         }
    }

