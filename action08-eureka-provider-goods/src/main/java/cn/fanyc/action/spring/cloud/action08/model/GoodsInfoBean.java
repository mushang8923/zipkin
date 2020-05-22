package cn.fanyc.action.spring.cloud.action08.model;

import java.math.BigDecimal;

/**
 * 商品信息实体
 *
 * @author Fanyc
 * @date 2019/12/6 22:14
 */
public class GoodsInfoBean {

    /**
     * 商品ID
     */
    private String goodsId;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 商品价格
     */
    private BigDecimal price;

    /**
     * 获取goodsId
     *
     * @return 返回goodsId
     */
    public String getGoodsId() {
        return goodsId;
    }

    /**
     * 设置goodsId的值
     *
     * @param goodsId 要设置的值
     * @return 当前对象
     */
    public GoodsInfoBean setGoodsId(String goodsId) {
        this.goodsId = goodsId;
        return this;
    }

    /**
     * 获取goodsName
     *
     * @return 返回goodsName
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * 设置goodsName的值
     *
     * @param goodsName 要设置的值
     * @return 当前对象
     */
    public GoodsInfoBean setGoodsName(String goodsName) {
        this.goodsName = goodsName;
        return this;
    }

    /**
     * 获取price
     *
     * @return 返回price
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置price的值
     *
     * @param price 要设置的值
     * @return 当前对象
     */
    public GoodsInfoBean setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }
}
