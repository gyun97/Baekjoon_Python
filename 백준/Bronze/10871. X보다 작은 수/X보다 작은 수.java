
import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int[] A = new int[N];

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        for (int j = 0; j < N; j++){
            if (A[j] < X){
                bw.write(A[j] + " ");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}