import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Напишите программу, которая переворачивает массив
        String[] arr = {"Hello", "World", "I'm happy"};
        StringBuilder reversed = new StringBuilder();
        for( int i = arr.length; i>0; i--){
            reversed.append(arr[i-1]).append(" ");
        }
        String[]reversedArray = reversed.toString().split(" ");
        System.out.println(Arrays.toString(reversedArray));

        //Напишите Java-программу для удаления всех пробелов из строки с помощью replace().

        String s = " Hello   World I'm Happy";
        String s2 = s.replaceAll("\\s+", "");
        System.out.println(s2);

    }
}
