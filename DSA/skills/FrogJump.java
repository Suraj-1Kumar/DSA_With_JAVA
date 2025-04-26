public class FrogJump {
    static int bestPath(int[] h){
        int n = h.length;
        int prev1 = 0;
        int prev2 = 0;

        for(int i = 0; i < n; i++){
            int onestep = prev1 + Math.abs(h[i + 1] - h[i]);

            int twostep = i > 1 ? prev2 + Math.abs(h[i+2] - h[i]) : Integer.MAX_VALUE;

            int curr = Math.min(onestep, twostep);
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }

    static int best(int[] h, int idx){
        int n = h.length;
        if(idx == n-1) return 0;

        int opt1 = Math.abs(h[idx] - h[idx+1]) + best(h, idx + 1);
        if(idx == n-2) return opt1;

        int opt2 = Math.abs(h[idx] - h[idx+2]) + best(h, idx + 2);

        return Math.min(opt1, opt2);
    }

    public static void main(String[] args) {
        int[] h = {10, 30, 40, 20};

        //System.out.println("Min Cost : " + best(h, 0));

        System.out.println(bestPath(h));
    }
}
