package indi.zeroornull.pattern.memento.v1.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class OriginData {
    @Getter
    @Setter
    private String data1;

    @Setter
    @Getter
    private String data2;

    // 不对外暴露
    private String data3;

    // 1.对象快照
//    public OriginData snapshot() {
//        // 拷贝属性值（这里并没有完全遵从原型模式，就是简单的拷贝）
//        return new OriginData(data1, data2, data3);
//    }

//    // 2.回滚快照
//    public void rollback(OriginData snapshot) {
//        // 恢复数据
//        this.data1 = snapshot.data1;
//        this.data2 = snapshot.data2;
//        // 虽然data3是private的，但可以访问
//        this.data3 = snapshot.data3;
//    }
    
    // 1.创建Snapshot类型的快照（之前返回的是OriginData）
    public Snapshot snapshot() {
        return new Snapshot(data1, data2, data3);
    }

    // 2.接收Snapshot快照并回复对象状态
    public void rollback(Snapshot snapshot) {
        // 恢复数据
        data1 = snapshot.getData1();
        data2 = snapshot.getData2();
        data3 = snapshot.getData3();
    }

}
