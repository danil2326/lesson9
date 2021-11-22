package lesson9;

public class lesson9 {
    public static void main(String[] args) {
        String[][] arr = new String[][]{{"1", "2", "3", "4"},
                                        {"2", "2", "2", "3"},
                                        {"1", "2", "2", "2"},
                                        {"2", "2", "2", "2"}};
        String[][] arr2 = new String[][]{ {"1", "2", "0", "3"},
                                          {"6", "4", "1", "5"},
                                          {"9", "2", "7", "4"},
                                          {"0", "2"}};
        String[][] arr3 = new String[][] {{"1", "9", "2", "3"},
                                          {"6", "1", "5", "7"},
                                          {"2", "Z", "7", "6"},
                                          {"1", "9", "4", "5"}};
        try {
            System.out.println("Первый массив");
            int sum = methodArray(arr);
            System.out.println(sum);
        } catch (MyArraySizeExeption e) {
            System.out.println("Размер массива превышен!");
        }
        catch (MyArrayDataExeption e) {
        System.out.println("Неправильное значение массива!");
        System.out.println("Ошибка в ячейках:" + e.j + " " + e.j);
    }
        try {
            System.out.println("Второй массив");
            int sum = methodArray(arr2);
            System.out.println(sum);
        } catch (MyArraySizeExeption e) {
            System.out.println("Размер массива превышен!");
        }
        catch (MyArrayDataExeption e) {
            System.out.println("Неправильное значение массива!");
            System.out.println("Ошибка в ячейках:" + e.j + " " + e.j);
        }

        try {
            System.out.println("Третий массив");
            int sum = methodArray(arr3);
            System.out.println(sum);
        } catch (MyArraySizeExeption e) {
            System.out.println("Размер массива превышен!");
        }
        catch (MyArrayDataExeption e) {
            System.out.println("Неправильное значение массива!");
            System.out.println("Ошибка в ячейках:" + e.j + " " + e.j);
        }


    }


    public static int methodArray(String[][] arr) throws MyArraySizeExeption, MyArrayDataExeption {
        int converter = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeExeption();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    converter += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataExeption(i, j);
                }


            }

        }
        return converter;


    }
}

