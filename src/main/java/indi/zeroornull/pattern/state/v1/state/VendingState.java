package indi.zeroornull.pattern.state.v1.state;

public interface VendingState {
    void insertCoin();

    void selectGoods();

    void dispense();
}
