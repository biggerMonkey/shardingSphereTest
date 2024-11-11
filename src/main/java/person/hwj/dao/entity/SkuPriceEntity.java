package person.hwj.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author:
 * @date: 2024/11/5 09:31
 * @description:
 */
@Data
@TableName("sku_price")
public class SkuPriceEntity {
    /**
     * 自增无意义主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;
    /**
     * 商品ID
     */
    private Long skuId;

    /**
     * 租户ID，默认值为1
     */
    private String tenantCode;
    /**
     * 价格单位
     */
    private String unit;
    /**
     * 商品原价
     */
    private BigDecimal originPrice;

    /**
     * 扩展信息，JSON格式存储
     */
    private String extInfo;

    /**
     * 删除状态： 1、未删除，0、删除
     */
    private Integer yn;

    /**
     * 创建人PIN
     */
    private String creator;

    /**
     * 修改人PIN
     */
    private String modifier;

    /**
     * 创建时间
     */
    private Date created;

    /**
     * 修改时间
     */
    private Date modified;
}
