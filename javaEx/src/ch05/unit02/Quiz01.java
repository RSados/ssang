package ch05.unit02;

public class Quiz01 {
	public static void main(String[] args) {
        int[]num = new int[] {25,15,7,4,12,9,17,16,20,13};
        int t;

for(int i=1;i<num.length;i++){
    t=num[i];
    for(int j=i-1 ; j>=0;j--){
        if(t<num[j]){
            num[j+1]=num[j];
            num[j]=t;
        }
        else{num[j+1]=t;break;}


}        }
for(int n:num){
System.out.print(n+" ");
}







}

}