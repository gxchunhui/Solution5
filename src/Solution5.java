import java.util.Scanner;
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
            Arrays.sort(array);//������������������
            //���ź�����������ظ����������ѡ����������������һ����
            System.out.println(array[0]);
            for(int i=1;i<n;i++){
                if(array[i] != array[i-1])
                    System.out.println(array[i]);
            }
        }
    }
}