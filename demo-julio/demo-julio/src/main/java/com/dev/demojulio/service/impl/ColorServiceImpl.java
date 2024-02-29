package com.dev.demojulio.service.impl;

import com.dev.demojulio.dto.ColorDto;
import com.dev.demojulio.mapper.ColorMapper;
import com.dev.demojulio.repository.ColorRepository;
import com.dev.demojulio.service.IColorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ColorServiceImpl implements IColorService {

    private final ColorRepository colorRepository;
    private final ColorMapper colorMapper;

    @Override
    public List<ColorDto> getAllColors() {
        return colorMapper.convert(colorRepository.findAll());
    }

    @Override
    public ColorDto getColorByName(String color) {
        return colorMapper.convert(colorRepository.findByName(color));
    }

    @Override
    public void deleteColorByName(String color) {
        colorRepository.delete(colorRepository.findByName(color));
    }

    @Override
    public ColorDto createColor(ColorDto colorDto) {
        return colorMapper.convert(colorRepository.save(colorMapper.convert(colorDto)));
    }
}
