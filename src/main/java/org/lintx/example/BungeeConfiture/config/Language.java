package org.lintx.example.BungeeConfiture.config;


import org.lintx.plugins.modules.configure.BungeeConfigure;
import org.lintx.plugins.modules.configure.ConfigureAnnotation;

public class Language extends BungeeConfigure {

    @ConfigureAnnotation.yamlConfig
    public String string1 = "";
}
