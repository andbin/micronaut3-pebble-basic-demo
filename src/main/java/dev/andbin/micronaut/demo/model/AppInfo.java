/*
SPDX-FileCopyrightText: Copyright (c) 2022 Andrea Binello ("andbin")
SPDX-License-Identifier: MIT
*/

package dev.andbin.micronaut.demo.model;

import java.util.Map;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class AppInfo {
    private String javaRuntimeVersion;
    private String micronautVersion;
    private String pebbleVersion;
    private Map<String, String> nettyVersions;

    public String getJavaRuntimeVersion() {
        return javaRuntimeVersion;
    }

    public void setJavaRuntimeVersion(String javaRuntimeVersion) {
        this.javaRuntimeVersion = javaRuntimeVersion;
    }

    public String getMicronautVersion() {
        return micronautVersion;
    }

    public void setMicronautVersion(String micronautVersion) {
        this.micronautVersion = micronautVersion;
    }

    public String getPebbleVersion() {
        return pebbleVersion;
    }

    public void setPebbleVersion(String pebbleVersion) {
        this.pebbleVersion = pebbleVersion;
    }

    public Map<String, String> getNettyVersions() {
        return nettyVersions;
    }

    public void setNettyVersions(Map<String, String> nettyVersions) {
        this.nettyVersions = nettyVersions;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "["
                + "javaRuntimeVersion=" + javaRuntimeVersion + ", "
                + "micronautVersion=" + micronautVersion + ", "
                + "pebbleVersion=" + pebbleVersion + ", "
                + "nettyVersions=" + nettyVersions
                + "]";
    }
}
