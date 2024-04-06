package indi.zeroornull.pattern.memento;

//import indi.zeroornull.pattern.memento.v2.OriginData;
//import indi.zeroornull.pattern.memento.v2.SnapshotManager;
import indi.zeroornull.pattern.memento.v3.data.OriginData;
import indi.zeroornull.pattern.memento.v3.SnapshotManager;

public class SnapshotTest {
    public static void main(String[] args) {
        // 初始化OriginData、SnapshotManager
        OriginData originData =  new OriginData("内容01", "内容02", "内容03");
        SnapshotManager snapshotManager = new SnapshotManager();
        
        // 修改对象：版本1
        originData.setData1("内容11");
        originData.setData2("内容12");
        snapshotManager.add(originData.snapshot());
        
         // 修改对象：版本2
        originData.setData1("内容21");
        originData.setData2("内容22");
        snapshotManager.add(originData.snapshot());
        
         // 修改对象：版本3
        originData.setData1("内容31");
        originData.setData2("内容32");
        snapshotManager.add(originData.snapshot());

        // 弊端1：快照可以被修改
        // snapshotManager.get(0).setData1("快照被修改啦");
        // 弊端2：外部可以创建快照并加入到manager
        // OriginData manualSnapshot = new OriginData("", "", "");
        
        // 恢复快照到版本1
        System.out.println("当前状态： " + originData);
        originData.rollback(snapshotManager.get(0));
        System.out.println("恢复到快照1: " + originData);
        
    }
}
