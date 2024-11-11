package person.hwj.convert;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import person.hwj.dao.entity.SkuPriceEntity;
import person.hwj.dto.SkuPriceDto;

/**
 * @author:
 * @date: 2024/11/11 18:11
 * @description:
 */
@Mapper
public interface SkuPriceConverter {
    SkuPriceConverter instance = Mappers.getMapper(SkuPriceConverter.class);

    SkuPriceEntity toEntity(SkuPriceDto dto);
}
