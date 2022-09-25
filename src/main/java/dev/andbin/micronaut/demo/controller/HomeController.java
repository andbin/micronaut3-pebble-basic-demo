/*
SPDX-FileCopyrightText: Copyright (c) 2022 Andrea Binello ("andbin")
SPDX-License-Identifier: MIT
*/

package dev.andbin.micronaut.demo.controller;

import dev.andbin.micronaut.demo.model.HomeModel;
import dev.andbin.micronaut.demo.service.AppInfoService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.views.View;
import jakarta.inject.Inject;

@Controller("/")
public class HomeController {
    @Inject
    AppInfoService appInfoService;

    @View("home")
    @Get
    public HomeModel getHome() {
        return new HomeModel(appInfoService.getAppInfo());
    }
}
