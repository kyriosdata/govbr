/**
 * Copyright (c) 2021
 * Fábrica de Software - Instituto de Informática
 * Fábio Nogueira de Lucena
 */

package com.github.kyriosdata.govbr;

import org.junit.jupiter.api.Test;

import java.util.UUID;

class IntegracaoTest {

    @Test
    void geradores() {
        System.out.println(Integracao.createRandomNumber());
        System.out.println(UUID.randomUUID());
    }
}
