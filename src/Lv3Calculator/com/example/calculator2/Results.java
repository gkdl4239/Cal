package Lv3Calculator.com.example.calculator2;


import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

    // 큐 관리
public class Results {
    private final Queue<Number> queue = new LinkedList<>();

    public void setQueue(Number result) {
        this.queue.add(result);
    }

    //부동 소수점 5자리까지 반올림하는 알고리즘
    public Number decimal(Number result) {
        Number rounded = 0;
        if (result instanceof Double) {
            rounded = Math.round(result.doubleValue() * 100000) / 100000.0;
        }
        return rounded;
    }

    public void removeResult() {
        this.queue.poll();
    }
    
    // 결과값을 조회할때 각 자료형에 맞게 저장
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