import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s;
        String toAdd ="";
        ArrayList<String> movieList = new ArrayList<String>();

        while(!toAdd.equalsIgnoreCase("q")) {
            System.out.println("Add a movie: ");
            s = input.nextLine();
            movieList.add(s);
            System.out.println("Another Movie?(y/q)");
            toAdd = input.nextLine().toLowerCase();
        }
        Collections.sort(movieList);
        System.out.println(movieList);
        //keeps adding colors until you q....then prints out the array of movies
    }
}
