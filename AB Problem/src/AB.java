/**
 * Created by bryanbeale on 10/9/17.
 */
public class AB{

    public String createString(int N, int K){

        String val = new String(new char[N]).replace("\0", "A");
        int i = 1, start = 1, end = N, pairs = 0;
        StringBuilder sb = new StringBuilder(val);
        while(pairs < K && start < end){
            sb.setCharAt(i-1, 'A');
            sb.setCharAt(i, 'B');
            pairs++;
            i++;

            if (i == end){
                start++;
                end--;
                i = start;
            }
        }
        val = sb.toString();
        return pairs < K ? "" : val;
    }
}
