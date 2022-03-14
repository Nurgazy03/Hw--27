package com.company;

public class Box <T>  {
    private T size;

    public Box(T size) {
        this.size = size;
    }

    public Box() {
    }

    public T getSize() {
        return size;
    }

    public void setSize(T size) {
        this.size = size;
    }

    public static <T> Box create() {
        return new Box(15);
    }

    @Override
    public String toString() {
        return "Box - " +
                "size: " + size;
    }
}
