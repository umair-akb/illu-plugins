package net.runelite.client.plugins.disablerendering;

import net.runelite.api.*;
import net.runelite.api.hooks.DrawCallbacks;

public class DisableRenderCallbacks implements DrawCallbacks {

    @Override
    public void draw(Renderable renderable, int orientation, int pitchSin, int pitchCos, int yawSin, int yawCos, int x, int y, int z, long hash) {

    }

    @Override
    public void drawScenePaint(int orientation, int pitchSin, int pitchCos, int yawSin, int yawCos, int x, int y, int z, SceneTilePaint paint, int tileZ, int tileX, int tileY, int zoom, int centerX, int centerY) {

    }

    @Override
    public void drawSceneModel(int orientation, int pitchSin, int pitchCos, int yawSin, int yawCos, int x, int y, int z, SceneTileModel model, int tileZ, int tileX, int tileY, int zoom, int centerX, int centerY) {

    }

    @Override
    public void draw(int overlayColor) {

    }

    @Override
    public boolean drawFace(Model model, int face) {
        return false;
    }

    @Override
    public void drawScene(int cameraX, int cameraY, int cameraZ, int cameraPitch, int cameraYaw, int plane) {
    }

    @Override
    public void postDrawScene() {

    }

    @Override
    public void animate(Texture texture, int diff) {

    }
}
