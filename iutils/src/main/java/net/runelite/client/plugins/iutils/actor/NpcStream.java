package net.runelite.client.plugins.iutils.actor;


import net.runelite.client.plugins.iutils.game.iNPC;
import net.runelite.client.plugins.iutils.game.iObject;

import java.util.Arrays;
import java.util.stream.Stream;

public class NpcStream extends ActorStream<iNPC, NpcStream> {
    public NpcStream(Stream<iNPC> stream) {
        super(stream);
    }

    @Override
    protected NpcStream wrap(Stream<iNPC> stream) {
        return new NpcStream(stream);
    }

    /**
     * Returns a stream consisting of the elements of this stream with
     * any of the given {@link iNPC#index()}s
     */
    public NpcStream withIndex(int... indices) {
        return filter(n -> Arrays.stream(indices).anyMatch(index -> n.index() == index));
    }

    /**
     * Returns a stream consisting of the elements of this stream with
     * any of the given {@link iNPC#id()}s
     */
    public NpcStream withId(int... ids) {
        return filter(n -> Arrays.stream(ids).anyMatch(id -> n.id() == id));
    }

    /**
     * Returns a stream consisting of the elements of this stream with
     * any of the given {@link iObject#actions()}s
     */
    public NpcStream withAction(String... actions) {
        return filter(n -> Arrays.stream(actions).anyMatch(action -> n.actions().contains(action)));
    }
}
