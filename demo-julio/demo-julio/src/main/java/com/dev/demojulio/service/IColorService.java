package com.dev.demojulio.service;

import com.dev.demojulio.dto.ColorDto;

import java.util.List;

public interface IColorService {

    List<ColorDto> getAllColors();

    ColorDto getColorByName(String color);

    void deleteColorByName(String color);

    ColorDto createColor(ColorDto colorDto);
}
