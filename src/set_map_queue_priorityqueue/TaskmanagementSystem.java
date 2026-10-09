package set_map_queue_priorityqueue;

import java.util.PriorityQueue;

public class TaskmanagementSystem {
    static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Pay Bills");
        pq.add("Watch Movie");
        pq.add("Complete assignments");
        pq.add("Prepare for Exam");
        pq.add("Watch Movie");

        System.out.println(pq.poll());
    }
}
