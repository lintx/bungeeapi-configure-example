package org.lintx.example.BungeeConfiture.config;

import org.lintx.plugins.modules.configure.BungeeConfigure;
import org.lintx.plugins.modules.configure.YamlConfig;

@YamlConfig(path = "config/noyml.yml")
public class NoYmlToSaveFile extends BungeeConfigure {

    @YamlConfig
    public String string = "test string";
}
