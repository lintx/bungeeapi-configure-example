package org.lintx.example.BungeeConfiture.config;

import org.lintx.plugins.modules.configure.BungeeConfigure;
import org.lintx.plugins.modules.configure.YamlConfig;

public class Child extends BungeeConfigure {
    @YamlConfig
    public String str1 = "";

    @YamlConfig
    public int int1 = 0;

    @YamlConfig
    public Grandson grandson = new Grandson();
}
