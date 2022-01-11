/*
 * Copyright (c) 2019-2020, ganom <https://github.com/Ganom>
 * All rights reserved.
 * Licensed under GPL3, see LICENSE for the full scope.
 */
package net.runelite.client.plugins.iworldwalker.farming;

import lombok.Getter;
import net.runelite.api.coords.WorldPoint;

@Getter
public enum Trees {
    NONE("None"),
    FALADOR("Falador", new WorldPoint(3002, 3374, 0)),
    FARMING_GUILD("Farming Guild", new WorldPoint(1249, 3719, 0)),
    GNOME_STRONGHOLD("Gnome Stronghold", new WorldPoint(2437, 3418, 0)),
    LUMBRIDGE("Lumbridge", new WorldPoint(3195, 3230, 0)),
    TAVERLEY("Taverley", new WorldPoint(2936, 3450, 0)),
    VARROCK("Varrock", new WorldPoint(3227, 3457, 0));

    private final String name;
    private WorldPoint worldPoint;

    Trees(String name, WorldPoint worldPoint) {
        this.name = name;
        this.worldPoint = worldPoint;
    }

    Trees(String name) {
        this.name = name;
    }
}
