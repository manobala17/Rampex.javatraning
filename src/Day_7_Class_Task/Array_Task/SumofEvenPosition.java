package Day_7_Class_Task.Array_Task;

public class SumofEvenPosition {
        public static void main(String[] args){
            int sum =0;
            int[]arr={1,2,3,4,5};

            for(int i=0;i<=4;i++){
                if(i%2==0){
                sum=sum+arr[i];
            }

            System.out.println(sum);

        }
    }
}
