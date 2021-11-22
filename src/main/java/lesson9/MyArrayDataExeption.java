package lesson9;

public class MyArrayDataExeption extends Exception{
public int i;
public int j;

    public MyArrayDataExeption(int i, int j) {
        this.i = i;
        this.j = j;
    }
}
