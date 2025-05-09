import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class NetworkDelay {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>> adj = new ArrayList<>();

        for(int i=0; i<=n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<times.length; i++){
            adj.get(times[i][0]).add(new int[] {times[i][1], times[i][2]});
        }

        int [] dist = new int[n+1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[k] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[1] - b[1]);
        pq.offer(new int [] {k, 0});

        while(!pq.isEmpty()){
            int [] cur = pq.poll();
            int u = cur[0], time = cur[1];

            if(time > dist[u]) continue;

            for(int [] neighbor : adj.get(u)){
                int v = neighbor[0];
                int w = neighbor[1];
                if(dist[v] > dist[u] + w){
                    dist[v] = dist[u] + w;
                    pq.offer(new int [] {v, dist[v]});
                }
            }
        }

        int max = 0;
        for(int i=1; i<=n; i++){
            if(dist[i] ==  Integer.MAX_VALUE) {
                return -1;
            }
            if(max < dist[i]){
                max = dist[i];
            }
        }

        return max;
    }
}
