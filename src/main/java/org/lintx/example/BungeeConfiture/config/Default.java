package org.lintx.example.BungeeConfiture.config;

import org.lintx.plugins.modules.configure.BungeeConfigure;
import org.lintx.plugins.modules.configure.YamlConfig;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@YamlConfig
public class Default extends BungeeConfigure {
    enum exampleenum{
        A,B,C
    }

    @YamlConfig
    public String string1 = "default";

    @YamlConfig(path = "string2")
    public String aliasstring = "";

    @YamlConfig
    public int int1 = 0;

    @YamlConfig(path = "int2")
    public int aliasint = 0;

    @YamlConfig
    public double double1 = 0;

    @YamlConfig
    public exampleenum enum1 = exampleenum.C;

    @YamlConfig
    public List<String> liststr1 = new ArrayList<String>();

    @YamlConfig
    public List<Integer> listint1 = new ArrayList<Integer>();

    @YamlConfig(path = "child1")
    public Child child = new Child();

    @YamlConfig
    public Child child2 = new Child();

    @YamlConfig(path = "map1")
    public Map<String,String> map = new HashMap<String, String>();
}
