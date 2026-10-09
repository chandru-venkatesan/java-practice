package set_map_queue_priorityqueue;

import java.util.LinkedList;
import java.util.Queue;

public class CustomerSupportTicketSystem {
    static void main(String[] args) {
        Queue<String> q= new LinkedList<>();
        q.add("User 1");
        q.add("User 2");
        q.add("User 3");
        q.add("User 4");
        q.poll();
        System.out.println(q);



    }
}
