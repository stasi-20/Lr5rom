package com.example.lr5rom;

import com.example.lr5rom.task3.movable;
import com.example.lr5rom.task3.movable_point;
import org.junit.Test;

public class test_tesk3 {

    @Test
    public void test() {
        movable_point p1 = new movable_point(0,0);
        System.out.println(p1);
        p1.moveDown();
        p1.moveDown();
        System.out.println(p1);
        p1.moveRight();
        System.out.println(p1);

        movable p2 = new movable_point(2,3);
        p2.moveUP();
        System.out.println(p2);
    }
}
