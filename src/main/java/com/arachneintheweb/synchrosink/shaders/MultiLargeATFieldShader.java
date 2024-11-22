package com.arachneintheweb.synchrosink.shaders;

import com.arachneintheweb.synchrosink.SynchroSink;
import com.mojang.blaze3d.vertex.PoseStack;

import net.minecraft.client.renderer.EffectInstance;
import net.minecraft.resources.ResourceLocation;
import team.lodestar.lodestone.systems.postprocess.MultiInstancePostProcessor;
import team.lodestar.lodestone.systems.postprocess.PostProcessor;

public class MultiLargeATFieldShader extends MultiInstancePostProcessor<LargeATFieldInstance> {
    public static final MultiLargeATFieldShader INSTANCE = new MultiLargeATFieldShader();

    private EffectInstance largeAtFieldInstance;

    private static final int MAX_INSTANCES = 16;
    private static final int SIZE_PER_INSTANCE = 6;

    @Override
    public ResourceLocation getPostChainLocation() {
        return ResourceLocation.fromNamespaceAndPath(SynchroSink.MODID, "multi_large_at_field_shader");
    }

    @Override
    protected int getMaxInstances() {
        return MAX_INSTANCES;
    }

    @Override
    protected int getDataSizePerInstance() {
        return SIZE_PER_INSTANCE;
    }

    @Override
    public void init() {
        super.init();
        if (postChain != null) {
            largeAtFieldInstance = effects[0];
        }
    }

    @Override
    public void beforeProcess(PoseStack viewModelStack) {
        super.beforeProcess(viewModelStack);
        setDataBufferUniform(largeAtFieldInstance, "DataBuffer", "InstanceCount");
    }

    @Override
    public void afterProcess() {

    }

}
