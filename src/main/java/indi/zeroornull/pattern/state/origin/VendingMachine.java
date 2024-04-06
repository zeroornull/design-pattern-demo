package indi.zeroornull.pattern.state.origin;

import lombok.extern.slf4j.Slf4j;

/**
 * 售货机
 */
@Slf4j
public class VendingMachine {
    // 商品数量
    private int goodsNum;
    // 售货机当前状态
    private VendingStateEnum currentState;

    public VendingMachine(int goodsNum) {
        this.goodsNum = goodsNum;
        if (this.goodsNum <= 0) {
            currentState = VendingStateEnum.SOLD_OUT;
        } else {
            currentState = VendingStateEnum.WAIT_TO_INSERT_COIN;
        }
    }

    /**
     * 投币
     */
    public void insertCoin() {
        if (currentState == VendingStateEnum.SOLD_OUT) {
            log.info("UNSUPPORTED OPERATION：商品已售罄");
        } else if (currentState == VendingStateEnum.WAIT_TO_INSERT_COIN) {
            currentState = VendingStateEnum.WAIT_TO_SELECT_GOODS;
            log.info("投币成功，请选择商品");
        } else if (currentState == VendingStateEnum.WAIT_TO_SELECT_GOODS) {
            log.info("UNSUPPORTED OPERATION：已投币，请选择商品");
        } else if (currentState == VendingStateEnum.WAIT_TO_DISPENSE_GOODS) {
            log.info("UNSUPPORTED OPERATION：已投币，请确认出货");
        } else {
            throw new RuntimeException("未知状态，请联系客服");
        }
    }

    /**
     * 选择商品
     */
    public void selectGoods() {
        if (currentState == VendingStateEnum.SOLD_OUT) {
            log.info("UNSUPPORTED OPERATION：商品已售罄");
        } else if (currentState == VendingStateEnum.WAIT_TO_INSERT_COIN) {
            log.info("UNSUPPORTED OPERATION：请先投币");
        } else if (currentState == VendingStateEnum.WAIT_TO_SELECT_GOODS) {
            currentState = VendingStateEnum.WAIT_TO_DISPENSE_GOODS;
            log.info("选中XX商品");
        } else if (currentState == VendingStateEnum.WAIT_TO_DISPENSE_GOODS) {
            log.info("UNSUPPORTED OPERATION：已选择商品，请确认出货");
        } else {
            throw new RuntimeException("未知状态，请联系客服");
        }
    }

    /**
     * 确认出货
     */
    public void dispense() {
        if (currentState == VendingStateEnum.SOLD_OUT) {
            log.info("UNSUPPORTED OPERATION：商品已售罄");
        } else if (currentState == VendingStateEnum.WAIT_TO_INSERT_COIN) {
            log.info("UNSUPPORTED OPERATION：请先投币");
        } else if (currentState == VendingStateEnum.WAIT_TO_SELECT_GOODS) {
            log.info("UNSUPPORTED OPERATION：未选择商品，无法出货");
        } else if (currentState == VendingStateEnum.WAIT_TO_DISPENSE_GOODS) {
            goodsNum--;
            if (goodsNum <= 0) {
                currentState = VendingStateEnum.SOLD_OUT;
            } else {
                currentState = VendingStateEnum.WAIT_TO_INSERT_COIN;
            }
            log.info("商品已出货，请及时取走");
        } else {
            throw new RuntimeException("未知状态，请联系客服");
        }
    }

}
