package indi.zeroornull.pattern.chain_of_responsibility.verifier.refactor1;

import java.util.concurrent.ThreadLocalRandom;

public class OrderConvertService {

    public boolean convert(OrderConvertRequest request) {
        
        // 参数校验
        request.validate();
        // 业务校验
        this.bizCheck(request);
        
        // 保存转换记录
        this.saveConvertRecord(request.getOrderNo(), request.getChannel(), request.getUserId());
        
        
        if (request.getUserId() == null) {
            throw new IllegalArgumentException("用户未登录");
        }
        if (request.getOrderNo() == null || request.getOrderNo().trim().isEmpty()) {
            throw new IllegalArgumentException("订单号不能为空");
        }
        if (request.getChannel() == null) {
            throw new IllegalArgumentException("订单渠道不能为空");
        }
        
        long points = this.calculatePoints(request.getOrderNo(), request.getChannel());
        return this.sendPoints(request.getUserId(), points);
    }

    private void bizCheck(OrderConvertRequest request) {
        if (this.checkIfOrderNoConverted(request.getOrderNo())) {
            throw new RuntimeException("订单已被转换");
        }
        if (this.checkUserChannelRelation(request.getOrderNo(), request.getChannel(), request.getUserId())) {
            throw new RuntimeException("账号已被绑定");
        }
    }

    private boolean sendPoints(Long userId, long points) {
        // 省略逻辑...
        return true;
    }

    private long calculatePoints(String orderNo, Integer channel) {
        // 省略逻辑...
        return 0;
    }

    private void saveConvertRecord(String orderNo, Integer channel, Long userId) {

    }

    private boolean checkUserChannelRelation(String orderNo, Integer channel, Long userId) {
        // 省略逻辑...
        return ThreadLocalRandom.current().nextBoolean();
    }

    private boolean checkIfOrderNoConverted(String orderNo) {
        // 省略逻辑...
        return ThreadLocalRandom.current().nextBoolean();
    }
}
