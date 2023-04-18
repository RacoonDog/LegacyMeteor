package io.github.racoondog.legacymeteor.commands;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import meteordevelopment.meteorclient.systems.commands.Command;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.command.CommandSource;

/**
 * Development environment related commands
 * @author Crosby
 */
@Environment(EnvType.CLIENT)
public class DevCommands extends Command {
    public DevCommands() {
        super("dev", "Dev related commands");
    }

    @Override
    public void build(LiteralArgumentBuilder<CommandSource> builder) {
        builder.then(literal("crash").executes(context -> {
            System.exit(0);
            return 0;
        }));
    }
}
