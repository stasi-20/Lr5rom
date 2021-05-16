package com.example.lr5rom;

import com.example.lr5rom.task2.*;
import org.junit.Test;

public class test_tesk2 {
    @Test
    public void test() {
        circle c1 = new circle();
        System.out.println(c1);

        rectangle r1 = new rectangle();
        System.out.println(r1);

        square s1 = new square();
        s1.setLength(4);
        s1.setWidth(4);
        System.out.println(s1);
    }
}
