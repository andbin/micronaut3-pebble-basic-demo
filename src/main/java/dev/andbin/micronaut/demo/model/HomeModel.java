/*
SPDX-FileCopyrightText: Copyright (c) 2022-2023 Andrea Binello ("andbin")
SPDX-License-Identifier: MIT
*/

package dev.andbin.micronaut.demo.model;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class HomeModel {
    private AppInfo appInfo;

    public HomeModel() {}

    public HomeModel(AppInfo appInfo) {
        this.appInfo = appInfo;
    }

    public AppInfo getAppInfo() {
        return appInfo;
    }

    public void setAppInfo(AppInfo appInfo) {
        this.appInfo = appInfo;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "["
                + "appInfo=" + appInfo
                + "]";
    }
}
