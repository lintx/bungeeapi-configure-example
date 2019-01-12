package org.lintx.example.BungeeConfiture.config;


import org.lintx.plugins.modules.configure.BungeeConfigure;
import org.lintx.plugins.modules.configure.YamlConfig;

@YamlConfig(path = "example.yml")
public class Example extends BungeeConfigure {

    @YamlConfig
    public String string1 = "";

    @YamlConfig(path = "child.string1")
    public String string2 = "";
}
