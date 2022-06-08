public class MergeSort{

    public static <T extends Comparable<T>> T[] divide(T[] v){
        return v;
    }

    public static void main(String args[]){
        String s[] = {"abc"};
        divide(s);
    }
}