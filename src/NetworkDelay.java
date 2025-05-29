import java.util.*;

public class NetworkDelay {
    public int networkDelayTime(int[][] times, int n, int k) {
        // 인접 경로
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






























































    /*
    Input: times = [[2,1,1],[2,3,1],[3,4,1]], n = 4, k = 2 // 노드개수, 시작점
    Output: 2

     */
    public int networkDelayTimeByMap(int[][] times, int n, int k) {
        // 인접 경로
        Map<Integer, List<int[]>> adj = new HashMap<>();
        for(int[] edge : times){
            adj.computeIfAbsent(edge[0], v -> new ArrayList<>()).add(new int[] {edge[1], edge[2]});
        }

        PriorityQueue<int []> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        //PriorityQueue<int []> pq = new PriorityQueue<>((a,b) -> a[1]-b[1]);

        pq.offer(new int[]{k, 0});

        int [] dist = new int [n+1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        dist[k] = 0;

        while(!pq.isEmpty()){
            int [] node = pq.poll();
            int time = node[1];
            int v = node[0];
            if(time > dist[v]){
                continue;
            }
            List<int []> neighbors = adj.getOrDefault(v, new ArrayList<>());
            for(int [] neighbor : neighbors){
                if(dist[neighbor[0]] > time + neighbor[1]){
                    dist[neighbor[0]] =  time + neighbor[1];
                    pq.offer(new int[] {neighbor[0], neighbor[1] + time});
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
