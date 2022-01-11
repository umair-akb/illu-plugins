/*
 * Copyright (c) 2019-2020, ganom <https://github.com/Ganom>
 * All rights reserved.
 * Licensed under GPL3, see LICENSE for the full scope.
 */
package net.runelite.client.plugins.iworldwalker.farming;

import lombok.Getter;
import net.runelite.api.coords.WorldPoint;

@Getter
public enum FruitTrees {
    NONE("None"),
    BRIMHAVEN("Brimhaven", new WorldPoint(2765, 3214, 0)),
    CATHERBY("Catherby", new WorldPoint(2858, 3434, 0)),
    FARMING_GUILD("Farming Guild", new WorldPoint(1249, 3719, 0)),
    GNOME_STRONGHOLD("Gnome Stronghold", new WorldPoint(2473, 3446, 0)),
    TREE_GNOME_VILLAGE("Tree Gnome Village", new WorldPoint(2489, 3182, 0)),
    TAI_BWO_WANNAI("Tai Bwo Wannai", new WorldPoint(2794, 3103, 0)),
    PRIFDDINAS("Prifddinas", new WorldPoint(3292, 6117, 0));

    private final String name;
    private WorldPoint worldPoint;

    FruitTrees(String name, WorldPoint worldPoint) {
        this.name = name;
        this.worldPoint = worldPoint;
    }

    FruitTrees(String name) {
        this.name = name;
    }
}
