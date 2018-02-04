package net.twasiplugin.commonvariables;

import net.twasi.core.plugin.TwasiPlugin;
import net.twasi.core.plugin.api.TwasiUserPlugin;

public class CommonVariables extends TwasiPlugin {
    public Class<? extends TwasiUserPlugin> getUserPluginClass() {
        return VariablesUserPlugin.class;
    }
}
