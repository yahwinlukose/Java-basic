class GenericEx{
    public static <T> void display(T value){
        System.out.println("Value :"+ value);
    }
    public static <E> void displayArray(E[] value){
        for(E element : value){
            System.out.println(" array is :"+element);
        }
        System.out.println();
    }
    public static void main(String[] args){
        display(10);
        display("hello");
        display(12.2);
        Integer[] arr1={1,2,3,4};
        String[] arr2={"hello","world"};
        displayArray(arr1);
        displayArray(arr2);
    }
}