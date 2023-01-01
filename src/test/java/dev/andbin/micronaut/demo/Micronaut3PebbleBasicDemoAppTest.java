/*
SPDX-FileCopyrightText: Copyright (c) 2022-2023 Andrea Binello ("andbin")
SPDX-License-Identifier: MIT
*/

package dev.andbin.micronaut.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;

@MicronautTest
class Micronaut3PebbleBasicDemoAppTest {
    @Inject
    EmbeddedApplication<?> application;

    @Test
    void testItWorks() {
        Assertions.assertTrue(application.isRunning());
    }
}
