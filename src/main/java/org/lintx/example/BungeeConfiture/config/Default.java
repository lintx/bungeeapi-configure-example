package org.lintx.example.BungeeConfiture.config;

import org.lintx.plugins.modules.configure.BungeeConfigure;
import org.lintx.plugins.modules.configure.ConfigureAnnotation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ConfigureAnnotation.yamlFile
public class Default extends BungeeConfigure {
    enum exampleenum{
        A,B,C
    }

    @ConfigureAnnotation.yamlConfig
    public String string1 = "default";

    @ConfigureAnnotation.yamlConfig(path = "string2")
    public String aliasstring = "";

    @ConfigureAnnotation.yamlConfig
    public int int1 = 0;

    @ConfigureAnnotation.yamlConfig(path = "int2")
    public int aliasint = 0;

    @ConfigureAnnotation.yamlConfig
    public double double1 = 0;

    @ConfigureAnnotation.yamlConfig
    public exampleenum enum1 = exampleenum.C;

    @ConfigureAnnotation.yamlConfig
    public List<String> liststr1 = new ArrayList<String>();

    @ConfigureAnnotation.yamlConfig
    public List<Integer> listint1 = new ArrayList<Integer>();

    @ConfigureAnnotation.yamlConfig(path = "child1")
    public Child child = new Child();

    @ConfigureAnnotation.yamlConfig
    public Child child2 = new Child();

    @ConfigureAnnotation.yamlConfig(path = "map1")
    public Map<String,String> map = new HashMap<String, String>();
}
