package cn.fanyc.action.spring.cloud.action08.model;

import java.math.BigDecimal;
import java.util.List;

/**
 * 订单信息实体
 *
 * @author Fanyc
 * @date 2019/12/6 22:12
 */
public class OrderInfoBean {

    /**
     * 订单ID
     */
    private String orderId;

    /**
     * 订单所属用户ID
     */
    private String userId;

    /**
     * 订单价格
     */
    private BigDecimal price;

    /**
     * 订单备注
     */
    private String remark;

    /**
     * 订单商品列表
     */
    private List<?> goods;

    /**
     * Getter
     *
     * @return the orderId value
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Setter
     *
     * @param orderId set the orderId value
     */
    public OrderInfoBean setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * Getter
     *
     * @return the userId value
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Setter
     *
     * @param userId set the userId value
     */
    public OrderInfoBean setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Getter
     *
     * @return the price value
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Setter
     *
     * @param price set the price value
     */
    public OrderInfoBean setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    /**
     * Getter
     *
     * @return the remark value
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Setter
     *
     * @param remark set the remark value
     */
    public OrderInfoBean setRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /**
     * Getter
     *
     * @return the goods value
     */
    public List<?> getGoods() {
        return goods;
    }

    /**
     * Setter
     *
     * @param goods set the goods value
     */
    public OrderInfoBean setGoods(List<?> goods) {
        this.goods = goods;
        return this;
    }
}
