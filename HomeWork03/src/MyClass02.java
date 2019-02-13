public class MyClass02 {
    public static void main(String [] args){
        Integer[] integerArray = {1,2,3,4,5,6,7,8,9,0};
        Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9};
        Character[] characterArray = {'H','E','L','L','O'};
        System.out.println("输出整型数组");
        printArray(integerArray);
        System.out.println("\n输出双精度型数组：");
        printArray(doubleArray);
        System.out.println("\n输出字符型数组：");
        printArray(characterArray);
    }
    //重载
    /*
    public static void printArray(Integer[] inputArray){
        for (Integer element : inputArray){
            System.out.printf("%s",element);
            System.out.println();
        }
    }
    public static void printArray(Double[] inputArray){
        for (Double element : inputArray){
            System.out.printf("%s",element);
            System.out.println();
        }
    }
    public static void printArray(Character[] inputArray){
        for (Character element : inputArray){
            System.out.printf("%s",element);
            System.out.println();
        }
    }
    */
    //泛型
    public static <E> void printArray(E[] inputArray){
        for (E element : inputArray){
            System.out.printf("%s",element);
        }
        System.out.println();
    }
}
