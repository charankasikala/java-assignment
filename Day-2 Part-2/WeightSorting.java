import java.util.Scanner;
import java.util.Arrays;

public class WeightSorting {
    public static void main(String[] args) {
        int weight[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<weight.length; i++){
            System.out.println("Enter weight of person "+(i+1));
            weight[i] = sc.nextInt();
        }

        for(int i=0; i<weight.length; i++){
            int max = weight[i];
            for(int j=i+1; j<weight.length; j++){
                if(weight[j]>max){
                    max = weight[j];
                    weight[j] = weight[i];
                    weight[i] = max;
                }
            }
        }
        System.out.println("Sorted weights in descending order:");
        System.out.println(Arrays.toString(weight));

    }

}

