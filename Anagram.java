import java.io.*;
import java.util.*;

public class Anagram {
    static int abc=256;
    static boolean anAnagram(char str1[], char str2[])
    {
        int count1[]=new int[abc];
        Arrays.fill(count1,0);
        int count2[] = new int[abc];
        Arrays.fill(count2,0);
        int i;

        for(i=0;i<str1.length && i<str2.length; i++)
        {
            count1[str1[i]]++;
            count2[str2[i]]++;

        }
        if(str1.length != str2.length)
            return false;
        for(i=0;i<abc;i++)
            if(count1[i]!=count2[i])
                return false;
        return true;
    }

    public static void main(String args[])
    {
        char str1[]=("listen").toCharArray();
        char str2[]=("silent").toCharArray();

        if(anAnagram(str1,str2))
            System.out.println("Anagram" +"");
        else
            System.out.println("Not anagram" +"");
    }
}
