public class App {
    public static void main(String[] args) throws Exception {
        int sum = 0; 
        int asum = 0;
        int bsum = 0;

        for(int i=0; i<=50; i++){
            if(i%2 == 0){
                System.out.println("짝수합 :" + (asum += i));
            }else{
                System.out.println("홀수합 :" + (bsum += i));
            }
            sum = asum + bsum;
        }
        System.out.println("전체 누적합 : " + sum);
    
    }
}
