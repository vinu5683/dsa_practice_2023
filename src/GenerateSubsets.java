import java.util.ArrayList;
import java.util.List;

public class GenerateSubsets {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        int n = arr.length;

        generateSubsets(arr,n-1,new ArrayList<>());
        for (List<Integer> subset : result) {
            System.out.print("[");
            if(!subset.isEmpty())
                System.out.print(subset.get(0));
            for (int i = 1; i < subset.size(); i++) {
                int item = subset.get(i);
                System.out.print(", "+item );
            }
            System.out.print("]");

            System.out.println();
        }
    }

    static List<List<Integer>> result = new ArrayList<>();

    public static void generateSubsets(int[] arr, int n, List<Integer> res){
        if(n==-1){
            result.add(new ArrayList<>(res));
            return;
        }
        generateSubsets(arr,n-1,res);
        res.add(arr[n]);
        generateSubsets(arr,n-1,res);
        if(!res.isEmpty())
         res.remove(res.size()-1);
    }
}
