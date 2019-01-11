package org.lintx.example.BungeeConfiture.config;

import org.lintx.plugins.modules.configure.BungeeConfigure;
import org.lintx.plugins.modules.configure.ConfigureAnnotation;

@ConfigureAnnotation.yamlFile(path = "config/noyml.yml")
public class NoYmlToSaveFile extends BungeeConfigure {

    @ConfigureAnnotation.yamlConfig
    public String string = "test string";
}
