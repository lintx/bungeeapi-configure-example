package org.lintx.example.BungeeConfiture.config;

import org.lintx.plugins.modules.configure.BungeeConfigure;
import org.lintx.plugins.modules.configure.ConfigureAnnotation;

public class Child extends BungeeConfigure {
    @ConfigureAnnotation.yamlConfig
    public String str1 = "";

    @ConfigureAnnotation.yamlConfig
    public int int1 = 0;

    @ConfigureAnnotation.yamlConfig
    public Grandson grandson = new Grandson();
}
