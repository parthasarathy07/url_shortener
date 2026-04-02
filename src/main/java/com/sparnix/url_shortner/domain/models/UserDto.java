package com.sparnix.url_shortner.domain.models;

import java.io.Serializable;


public record UserDto(Long id, String name) implements Serializable {
}
