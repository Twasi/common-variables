package net.twasiplugin.commonvariables;

import net.twasi.core.plugin.api.TwasiUserPlugin;
import net.twasi.core.plugin.api.TwasiVariable;
import net.twasiplugin.commonvariables.variables.ChannelVar;
import net.twasiplugin.commonvariables.variables.RandomVar;
import net.twasiplugin.commonvariables.variables.SenderVar;

import java.util.Arrays;
import java.util.List;

public class VariablesUserPlugin extends TwasiUserPlugin {
    @Override
    public List<TwasiVariable> getVariables() {
        return Arrays.asList(
                new RandomVar(this),
                new SenderVar(this),
                new ChannelVar(this)
        );
    }
}
