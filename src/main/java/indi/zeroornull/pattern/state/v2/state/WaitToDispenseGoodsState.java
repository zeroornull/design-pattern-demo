package indi.zeroornull.pattern.state.v2.state;

import indi.zeroornull.pattern.state.v2.VendingMachine;

public class WaitToDispenseGoodsState implements VendingState{
    
    private final VendingMachine vendingMachine;
    
    public WaitToDispenseGoodsState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }
    
    @Override
    public void insertCoin() {
        System.out.println("UNSUPPORTED OPERATION：已投币，请确认出货");
    }

    @Override
    public void selectGoods() {
        System.out.println("UNSUPPORTED OPERATION：已选择商品，请确认出货");
    }

    @Override
    public void dispense() {
        // 委托给machine统一切换
        vendingMachine.nextState();
        System.out.println("出货成功");
    }
}
