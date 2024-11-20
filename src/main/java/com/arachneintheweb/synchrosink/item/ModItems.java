package com.arachneintheweb.synchrosink.item;

import com.arachneintheweb.synchrosink.SynchroSink;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(SynchroSink.MODID);

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
