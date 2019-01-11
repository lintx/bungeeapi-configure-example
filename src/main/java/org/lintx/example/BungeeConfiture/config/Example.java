package org.lintx.example.BungeeConfiture.config;


import org.lintx.plugins.modules.configure.BungeeConfigure;
import org.lintx.plugins.modules.configure.ConfigureAnnotation;

@ConfigureAnnotation.yamlFile(path = "example.yml")
public class Example extends BungeeConfigure {

    @ConfigureAnnotation.yamlConfig
    public String string1 = "";

    @ConfigureAnnotation.yamlConfig(path = "child.string1")
    public String string2 = "";
}
