package indi.zeroornull.pattern.state.v1;

import indi.zeroornull.pattern.state.v1.state.SoldOutState;
import indi.zeroornull.pattern.state.v1.state.VendingState;
import indi.zeroornull.pattern.state.v1.state.WaitToInsertCoinState;

/**
 * state pattern version1：各个State自己负责切换状态
 */
public class VendingMachine {
    // 商品数量
    private int goodsNum;
    // 售货机当前状态
    private VendingState currentState;

    public VendingMachine(int goodsNum) {
        this.goodsNum = goodsNum;
        if (this.goodsNum <= 0) {
            this.currentState = new SoldOutState(this);
        } else {
            this.currentState = new WaitToInsertCoinState(this);
        }
    }

    public void insertCoin() {
        this.currentState.insertCoin();
    }

    public void selectGoods() {
        this.currentState.selectGoods();
    }

    public void dispense() {
        this.currentState.dispense();
    }

    public void changeState(VendingState newState) {
        this.currentState = newState;
    }

    public int releaseGood() {
        // 返回剩余数量
        return goodsNum -= 1;
    }
}
