package net.twasiplugin.commonvariables.variables;

import net.twasi.core.interfaces.api.TwasiInterface;
import net.twasi.core.models.Message.TwasiMessage;
import net.twasi.core.plugin.api.TwasiUserPlugin;
import net.twasi.core.plugin.api.TwasiVariable;

import java.util.Arrays;
import java.util.List;

public class SenderVar extends TwasiVariable {
    public SenderVar(TwasiUserPlugin owner) {
        super(owner);
    }

    @Override
    public List<String> getNames() {
        return Arrays.asList("sender");
    }

    @Override
    public String process(String name, TwasiInterface inf, String[] params, TwasiMessage message) {
        if (message == null) {
            return "ERROR_NO_SENDER";
        }
        return message.getSender().getUserName();
    }
}
