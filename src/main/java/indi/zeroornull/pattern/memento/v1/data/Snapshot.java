package indi.zeroornull.pattern.memento.v1.data;

public class Snapshot {
    final String data1;
    final String data2;
    final String data3;

    Snapshot(String data1, String data2, String data3) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
    }

    // 快照创建后只读，只有getter没有setter

     String getData1() {
        return data1;
    }

     String getData2() {
        return data2;
    }

     String getData3() {
        return data3;
    }
}
