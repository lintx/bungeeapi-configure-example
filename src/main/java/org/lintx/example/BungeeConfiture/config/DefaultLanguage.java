package org.lintx.example.BungeeConfiture.config;


import org.lintx.plugins.modules.configure.BungeeConfigure;
import org.lintx.plugins.modules.configure.ConfigureAnnotation;

@ConfigureAnnotation.yamlFile(path = "language_en_us.yml")
public class DefaultLanguage extends BungeeConfigure {

    @ConfigureAnnotation.yamlConfig
    public String string1 = "";
}
