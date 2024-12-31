import java.util.*;
class Solution {
    static class Truck {
        int weight, position;
    
        public Truck(int weight) {
            this.weight = weight;
            this.position = 0;
        }

        public Truck(int weight, int position) {
            this.weight = weight;
            this.position = position;
        }
    }
    
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;
        int bridgeWeight = 0;
        Queue<Truck> bridge = new LinkedList<>();
        int idx = 0;
        
        while (idx < truck_weights.length || !bridge.isEmpty()) {
            time++;
            
            if (!bridge.isEmpty()) {
                Truck frontTruck = bridge.peek();
                if (time - frontTruck.position >= bridge_length) {
                    bridgeWeight -= frontTruck.weight;
                    bridge.poll();
                }
            }
            
            if (idx < truck_weights.length) {
                if (bridgeWeight + truck_weights[idx] <= weight && bridge.size() < bridge_length) {
                    bridge.add(new Truck(truck_weights[idx], time));
                    bridgeWeight += truck_weights[idx];
                    idx++;
                }
            }
        }
        return time;
    }
}