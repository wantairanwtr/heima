public class Arrayzuizhi {
    public static void main(String[]args){
        int [] arr={12,45,98,73,60};
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("最大值是:"+max);
        System.out.println("最小值是:"+min);
    }
}
