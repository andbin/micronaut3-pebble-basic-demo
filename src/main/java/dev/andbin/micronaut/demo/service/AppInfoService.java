/*
SPDX-FileCopyrightText: Copyright (c) 2022-2023 Andrea Binello ("andbin")
SPDX-License-Identifier: MIT
*/

package dev.andbin.micronaut.demo.service;

import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.andbin.micronaut.demo.model.AppInfo;
import jakarta.inject.Singleton;

@Singleton
public class AppInfoService {
    private static final Logger logger = LoggerFactory.getLogger(AppInfoService.class);

    public AppInfo getAppInfo() {
        AppInfo appInfo = new AppInfo();
        appInfo.setJavaRuntimeVersion(getJavaRuntimeVersion());
        appInfo.setMicronautVersion(getMicronautVersion());
        appInfo.setPebbleVersion(getPebbleVersion());
        appInfo.setNettyVersions(getNettyVersions());
        return appInfo;
    }

    private String getJavaRuntimeVersion() {
        return Runtime.version().toString();   // Java 9+
    }

    private String getMicronautVersion() {
        return io.micronaut.core.version.VersionUtils.getMicronautVersion();
    }

    private String getPebbleVersion() {
        // Note: this is the only way I found to get Pebble version ...
        Properties props = new Properties();

        try (var is = getClass().getResourceAsStream("/META-INF/maven/io.pebbletemplates/pebble/pom.properties")) {
            props.load(is);
        } catch (Exception e) {
            logger.error("Failed loading of Pebble pom.properties", e);
        }

        return props.getProperty("version");
    }

    private Map<String, String> getNettyVersions() {
        var versions = new TreeMap<String, String>();

        for (var entry : io.netty.util.Version.identify().entrySet()) {
            versions.put(entry.getKey(), entry.getValue().artifactVersion());
        }

        return versions;
    }
}
