package com.practica;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {

    @Test
    public void testCalcular() {
        App app = new App();
        assertEquals(5, app.calcular());
    }
}
