package net.twasiplugin.commonvariables.variables;

import net.twasi.core.interfaces.api.TwasiInterface;
import net.twasi.core.plugin.api.TwasiUserPlugin;
import net.twasi.core.plugin.api.TwasiVariable;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

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
        // Check length of arguments
        if (params.length != 2) {
            return "ERROR_NUMBER_OF_PARAMETERS";
        }

        int min, max;

        // Try to parse numbers
        try {
            min = Integer.valueOf(params[0]);
            max = Integer.valueOf(params[1]);
        } catch (NumberFormatException e) {
            return "ERROR_UNKNOWN_NUMBER";
        }

        // Generate random number
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);

        return String.valueOf(randomNum);
    }
}
