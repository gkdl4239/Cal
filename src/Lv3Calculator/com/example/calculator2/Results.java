package Lv3Calculator.com.example.calculator2;


import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Results {
    private final Queue<Number> queue = new LinkedList();

    public Results() {
    }

    public void setQueue(Number result) {
        this.queue.add(result);
    }

    public void removeResult() {
        this.queue.poll();
    }

    public List getQueue(int std) {
        return this.queue.stream().filter((n) -> {
            if (n instanceof Integer) {
                return (Integer)n > std;
            } else if (n instanceof Double) {
                return (Double)n > (double)std;
            } else {
                return false;
            }
        }).toList();
    }
}