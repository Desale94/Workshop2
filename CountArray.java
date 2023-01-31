public class CountArray {
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 4, 5, 2, 6, 2};
        int temp[]=new int [arr.length];
        int visited=-1;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < arr.length; i++) {
            int count=1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] ==arr[j]) {
                    count++;
                    temp[j] = visited;
                }
            }
            if (temp[i] != visited){
                temp[i]=count;
            }

        }
        for (int i=0;i<temp.length;i++){
            if (temp[i] !=visited){
                System.out.println("number " +arr[i]+ " is repeated  " +temp[i]);
            }
        }
      //System.out.println("1 is repeat in:" +arr[i]);
    }
}
