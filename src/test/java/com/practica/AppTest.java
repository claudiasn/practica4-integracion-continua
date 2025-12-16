package com.practica;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        assertEquals(8, new App().calcular());
    }
}
