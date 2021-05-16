package com.example.lr5rom.task3;

public class movable_point implements movable {
    private int x;
    private int y;

    public movable_point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public void moveUP()
    {
        y++;
    }

    @Override
    public void moveDown()
    {
        y--;
    }

    @Override
    public void moveLeft()
    {
        x--;
    }

    @Override
    public void moveRight()
    {
        x++;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
