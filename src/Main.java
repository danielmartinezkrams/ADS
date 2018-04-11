import java.util.Random;

public class Main {

    public static void main(String[] args){
        int[][] arr = new int[5][5];
        String out = "";
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = (int)(Math.random() * 100);
                out += arr[row][col] + " ";
            }
            out += "\n";
        }
        System.out.println(out);
    }

}
