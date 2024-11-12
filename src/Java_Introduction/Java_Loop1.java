package Java_Introduction;
import java.io.*;

/*Sample Input

2
Sample Output

2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20


 */

public class Java_Loop1 {

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(bufferedReader.readLine().trim());
            int j=1;
            if(2<=N && N<=20)
            {
                for(int i=1;i<=10;i++)
                {
                    j=i*N;
                    System.out.println(N+" x "+i+" = "+j);
                }
                bufferedReader.close();
            }
        }


}
