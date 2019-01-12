package org.lintx.example.BungeeConfiture.config;


import org.lintx.plugins.modules.configure.BungeeConfigure;
import org.lintx.plugins.modules.configure.YamlConfig;

@YamlConfig(path = "language_en_us.yml")
public class DefaultLanguage extends BungeeConfigure {

    @YamlConfig
    public String string1 = "";
}
