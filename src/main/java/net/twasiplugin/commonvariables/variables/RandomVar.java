package net.twasiplugin.commonvariables.variables;

import net.twasi.core.interfaces.api.TwasiInterface;
import net.twasi.core.plugin.api.TwasiUserPlugin;
import net.twasi.core.plugin.api.TwasiVariable;

import java.util.Arrays;
import java.util.List;

public class RandomVar extends TwasiVariable {
    public RandomVar(TwasiUserPlugin owner) {
        super(owner);
    }

    @Override
    public List<String> getNames() {
        return Arrays.asList("random", "rdm");
    }

    @Override
    public String process(String name, TwasiInterface inf, String[] params) {
        return "IM_A_RANDOM_NUMBER";
    }
}
