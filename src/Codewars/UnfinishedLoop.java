package Codewars;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class UnfinishedLoop {
    public static List CreateList(int number)


    {
        List list = new ArrayList<>();

        for(int count = 1; count <= number; count++)
        {
            list.add(count);
        }

        return list;
    }
}

