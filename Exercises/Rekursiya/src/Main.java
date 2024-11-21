public class Main {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        print(arr);
    }

    public static void print(int[] array){
        int index = 0;
        if (index<array.length){

        System.out.println(array[index++]);
        print(array[index]);
        }
    }
}