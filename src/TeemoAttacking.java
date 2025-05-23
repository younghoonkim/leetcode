public class TeemoAttacking {

    public int findPoisonedDuration(int[] timeSeries, int duration) {

        int sum = 0;
        for(int i=0; i<timeSeries.length-1; i++){
            int time = timeSeries[i];
            int tick = 0;
            if(time + duration > timeSeries[i+1])
            {
                tick = timeSeries[i+1] - time;
            }else{
                tick = duration;
            }
            sum = sum + tick;
        }
        sum = sum + duration;

        return sum;
    }
}
