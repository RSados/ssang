package ch04.unit03.forEx;

import java.util.Scanner;

public class QuizHH01 {
    public static void main(String[] args) {;
       Scanner sc = new Scanner(System.in);
       int a,n;
       //가위 바위 보
       //1.가위 2.바위 3.보
       //가위(1) : 보(3), 바위(2) : 가위(1), 보(3) : 바위(2)
       
       do{
        System.out.println("1.가위 2.바위 3.보 4.게임종료 => ");
        a=sc.nextInt();
                switch(a){
            case 1 :System.out.println("당신 : 가위");break;
            case 2 :System.out.println("당신 : 바위");break;
            case 3 :System.out.println("당신 : 보");break;
        }
              if(a==4){
            break;}
            if(a>=1&&a<=4){

        n=(int)(Math.random()*2)+1;
        switch(n){
            case 1 :System.out.println("컴 : 가위");break;
            case 2 :System.out.println("컴 : 바위");break;
            case 3 :System.out.println("컴 : 보");break;
        }
        
        if(n-a==1||(a==3&&n==1)){
            System.out.println("당신이 졌습니다\n");
        }
        else if (n==a){
            System.out.println("당신은 비겼습니다\n");
        }
        else{
            System.out.println("당신은 이겼습니다\n");
        }}

       }while(true);
       sc.close();
    }}
/*
 int user,com
 while(true){
     do{
         System.out.println("1.가위 2.바위 3.보 4.게임종료 =>");
     while(user < 1|| user>4);
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 */


    //n=(int)(Math.random()*3)+1