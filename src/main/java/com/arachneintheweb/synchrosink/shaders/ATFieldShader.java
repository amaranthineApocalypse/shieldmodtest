package com.arachneintheweb.synchrosink.shaders;

import com.arachneintheweb.synchrosink.SynchroSink;
import com.mojang.blaze3d.vertex.PoseStack;

import net.minecraft.commands.arguments.ResourceLocationArgument;
import net.minecraft.resources.ResourceLocation;
import team.lodestar.lodestone.systems.postprocess.PostProcessor;

public class ATFieldShader extends PostProcessor {
    public static final ATFieldShader INSTANCE = new ATFieldShader();

    @Override
    public ResourceLocation getPostChainLocation() {
        return ResourceLocation.fromNamespaceAndPath(SynchroSink.MODID, "at_field_shader");
    }

    @Override
    public void beforeProcess(PoseStack viewModelStack) {

    }

    @Override
    public void afterProcess() {

    }

}
