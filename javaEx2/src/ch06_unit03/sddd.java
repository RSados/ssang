/*package Ch06_unit03_method;

import java.util.Scanner;

public class Munjae_1 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Quiz1 tt = new Quiz1();

      tt.input();
      tt.print_result();
   }

}

class Quiz1 {
   static String []name=new String[5];;
   static int []height=new int[5];;
   static int min[]=new int[5];;
   static int weight[]=new int[5];;
   static int rank[]=new int[5];;
   static int kcal[]=new int[5];;

   public void input() {
      
      Scanner sc = new Scanner(System.in);
      
      for (int i = 0; i < 5; i++) {
         System.out.println((i+1)+"번째 이름?");
         name[i] = sc.next();
         System.out.println((i+1)+"번째 키?");
         height[i] = sc.nextInt();
         System.out.println((i+1)+"번째 몸무게?");
         weight[i] = sc.nextInt();
         System.out.println((i+1)+"번째 운동시간?");
         min[i] = sc.nextInt();
      }
      
      sc.close();
   }

   public int Bmi(int weight,int height) {
      int bmi;
      
         bmi= weight / (height * height / 100);
      

      return bmi;
   }

/*
   // 4번 칼로리 소모 순위 계산하기.
   public void ranking(int[] kal) {
      int[] rank = new int[kal.length];

      for (int i = 0; i < kal.length; i++) { // rank배열 1로 초기화
         rank[i] = 1;
      }

      // 석차를 계산한다.
      for (int i = 0; i < kal.length - 1; i++) {
         for (int j = i + 1; j < kal.length; j++) {
            if (kal[i] > kal[j]) {
               rank[j]++;
            } else if (kal[i] < kal[j]) {
               rank[i]++;
            }
         }
      }
      System.out.println(Arrays.toString(rank));
   }
*//*
   public void print_result() {
      Quiz1 t = new Quiz1();
      int []bmi=new int[5];
      
      //int rank[];
      //rank = ranking(Third_method(time));
      // 3번이 리턴을 주는 형식이라면 3번의 리턴

      // int []p= tt.배열
      for(int i=0;i<5;i++) {
         bmi[i]=Bmi(weight[i],height[i]);
      }

      System.out.print("\t이름" + "\tBMI" + "\t소모 kcal" + "\t순위\n");
      for (int i = 0; i < 5; i++) {
         System.out.print("\t" + t.name[i]);
         System.out.print("\t" + bmi[i]);
         //System.out.print("\t" + t3.kcal[i]);
         //System.out.print("\t" + t4.rank[i]);
         System.out.println();
      }
   }

}*/