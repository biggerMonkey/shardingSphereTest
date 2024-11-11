package person.hwj.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import person.hwj.convert.SkuPriceConverter;
import person.hwj.dao.entity.SkuPriceEntity;
import person.hwj.dao.mapper.SkuPriceMapper;
import person.hwj.dto.SkuPriceDto;

import java.util.List;

/**
 * @author:
 * @date: 2024/11/11 17:49
 * @description:
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private SkuPriceMapper skuPriceMapper;

    @GetMapping("/alive")
    public String alive() {
        return "alive";
    }

    @PostMapping("/insert")
    public String insert(@RequestBody SkuPriceDto skuPriceDto) {
        SkuPriceEntity skuPriceEntity = SkuPriceConverter.instance.toEntity(skuPriceDto);
        skuPriceMapper.insert(skuPriceEntity);
        return "success";
    }

    @PostMapping("/list")
    public PageInfo<SkuPriceEntity> list(@RequestBody SkuPriceDto skuPriceDto) {
        PageHelper.startPage(skuPriceDto.getCurrentPage(), skuPriceDto.getPageSize());
        LambdaQueryWrapper<SkuPriceEntity> lambdaQueryWrapper = Wrappers.lambdaQuery(new SkuPriceEntity());
        List<SkuPriceEntity> skuPriceChangeEntityList = skuPriceMapper.selectList(lambdaQueryWrapper);
        return new PageInfo<>(skuPriceChangeEntityList);
    }
}
