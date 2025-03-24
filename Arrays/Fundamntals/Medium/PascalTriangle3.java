package Arrays.Fundamntals.Medium;
import java.util.*;

public class PascalTriangle3 {

    public static List<List<Integer>>pascalTriangle(int n){
        List<List<Integer>>result = new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer>eachRow=new ArrayList<>();
            eachRow.add(1);
            // Add top rows and push to each rows
            for(int j=1;j<i;j++){
                eachRow.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));
            }
            if(i>0){
                eachRow.add(1);
            }
            result.add(eachRow);
        }

        return result;
    }

    public static void main(String[] args) {
        int n=6;
        List<List<Integer>>result = pascalTriangle(n);
        
        for(List<Integer>row:result){
            System.out.print(row);
        }
        System.out.println();
    }
}
