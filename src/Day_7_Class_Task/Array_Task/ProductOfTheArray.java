package Day_7_Class_Task.Array_Task;

public class ProductOfTheArray {
        public static void main(String[] args){
            int Product =1;
            int[]arr={1,2,3,4,5};

            for(int i=0
                ;i<=4;i++){
                Product=Product*arr[i];
            }

            System.out.println(Product);

        }
    }
