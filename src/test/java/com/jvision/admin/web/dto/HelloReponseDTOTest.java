package com.jvision.admin.web.dto;

import com.jvision.admin.web.HelloController;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloReponseDTOTest {
    @Test
    public void lom_bok ()
    {
        String name ="das";
        int amount = 1000;

        HelloResponseDTO dto = new HelloResponseDTO(name,amount);
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}

