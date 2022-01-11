/*
 * Copyright (c) 2019-2020, ganom <https://github.com/Ganom>
 * All rights reserved.
 * Licensed under GPL3, see LICENSE for the full scope.
 */
package net.runelite.client.plugins.iworldwalker.farming;

import lombok.Getter;
import net.runelite.api.coords.WorldPoint;

@Getter
public enum Bushes {
    NONE("None"),
    ARDOUGNE("Ardougne", new WorldPoint(2616, 3227, 0)),
    CHAMPIONS_GUILD("Champions Guild", new WorldPoint(3182, 3360, 0)),
    ETCETERIA("Etceteria", new WorldPoint(2592, 3865, 0)),
    FARMING_GUILD("Farming Guild", new WorldPoint(1249, 3719, 0)),
    RIMMINGTON("Rimmington", new WorldPoint(2942, 3223, 0));

    private final String name;
    private WorldPoint worldPoint;

    Bushes(String name, WorldPoint worldPoint) {
        this.name = name;
        this.worldPoint = worldPoint;
    }

    Bushes(String name) {
        this.name = name;
    }
}
