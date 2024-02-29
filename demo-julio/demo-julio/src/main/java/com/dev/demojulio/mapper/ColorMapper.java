package com.dev.demojulio.mapper;

import com.dev.demojulio.dto.ColorDto;
import com.dev.demojulio.entity.ColorEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ColorMapper {

    ColorDto convert(ColorEntity entity);

    ColorEntity convert(ColorDto dto);

    List<ColorDto> convert(List<ColorEntity> entities);
}
