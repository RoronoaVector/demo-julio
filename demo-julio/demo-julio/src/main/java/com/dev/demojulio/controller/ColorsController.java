package com.dev.demojulio.controller;

import com.dev.demojulio.dto.ColorDto;
import com.dev.demojulio.service.IColorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping(value = "/color")
@RequiredArgsConstructor
public class ColorsController {

    private final IColorService colorService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ColorDto> getAllColors() {
        return colorService.getAllColors();
    }

    @GetMapping(value = "/{color}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ColorDto getByName(@PathVariable String color) {
        return colorService.getColorByName(color);
    }

    @DeleteMapping("/{color}")
    public void deleteColor(@PathVariable String color) {
        colorService.deleteColorByName(color);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ColorDto> createColor(@RequestBody ColorDto color) {
        return ResponseEntity.ok(colorService.createColor(color));
    }

}
