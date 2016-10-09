import java.util.Scanner;
import java.util.TreeSet;

public class Solution5 {
	public static void main(String[] args) {
		//TreeSet<Integer> ts=new TreeSet<Integer>();
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext())
		{
			TreeSet<Integer> ts=new TreeSet<Integer>();
			int s=sc.nextInt();
			if(s>0)
			{
				for(int i=0;i<s;i++)
				{
					ts.add(sc.nextInt());
				
					}
				
				}
	
			for(Integer it:ts)
		{
			System.out.println(it);
		}
		
		}
	}

}

/*import java.util.Scanner;
import java.util.TreeSet;
import java.util.Arrays;
  
public class Solution5
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         
        while(scan.hasNext()){
            int n = scan.nextInt();
            int[] array = new int[n];
            for(int i=0;i<n;i++){
                array[i] = scan.nextInt();
            }
            Arrays.sort(array);//对输入的数组进行排序
            //对排好序的数组中重复的数组进行选择输出，首先输出第一个数
            System.out.println(array[0]);
            for(int i=1;i<n;i++){
                if(array[i] != array[i-1])
                    System.out.println(array[i]);
            }
        }
    }
}*/
