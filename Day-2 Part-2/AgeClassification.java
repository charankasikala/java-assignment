import java.util.Scanner;
import java.util.Arrays;

public class AgeClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age [] = new int [10];
        for(int i=0; i<age.length; i++){
            age[i] = sc.nextInt();
        }
        int age18 = 0;
        int middleage = 0;
        int agemorethan60 = 0;
        for(int i=0; i<age.length; i++){
            if(age[i] < 18){
                age18++;
            }
            else if(age[i] >= 18 && age[i] <= 60){
                middleage++;
            }
            else if(age[i] > 60){
                agemorethan60++;
            }
        }
        System.out.println(Arrays.toString(age));
        System.out.println("Number of people under 18: " + age18);
        System.out.println("Number of people between 18 and 60: " + middleage);
        System.out.println("Number of people over 60: " + agemorethan60);

    }
}

