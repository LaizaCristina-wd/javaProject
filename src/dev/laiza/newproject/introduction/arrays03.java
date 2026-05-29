package dev.laiza.newproject.introduction;

public class arrays03 {
    public static void main(String[] args) {
        int[] number = new int[3];
        int[] number2 = {1,2,3,4,5};
        int[] number3 = new int[]{5, 4, 3, 2, 1};

     //   for(int i = 0; i < number3.length; i++){
       //     System.out.println(number3[i]);
       // }
        for(int num : number3){
            System.out.println(num);
        }
    }
}
