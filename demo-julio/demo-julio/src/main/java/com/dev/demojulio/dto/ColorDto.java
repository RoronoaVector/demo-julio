package com.dev.demojulio.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@ToString
public class ColorDto {

    private String name;
    private String pigmentation;
    private String description;
}
