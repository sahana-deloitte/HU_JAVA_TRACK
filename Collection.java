import java.io.*;
import java.util.*;

public class Collection {
    public static void main(String[] args)
    {
        ArrayList<String> abc=new ArrayList<>();
        abc.add("Hashedin");
        abc.add("by");
        abc.add("deloitte");
        abc.add("2022");

        System.out.println("Reverse order of the list :");

        Collections.reverse(abc);

        System.out.println(abc);
    }

}
