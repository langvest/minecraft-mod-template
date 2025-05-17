package com.example.examplemod.forge;

import com.example.examplemod.ExampleMod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.jetbrains.annotations.NotNull;

@Mod(ExampleMod.MOD_ID)
public class ExampleModForge {
	public ExampleModForge(@NotNull FMLJavaModLoadingContext context) {
		IEventBus bus = context.getModEventBus();
	}
}
