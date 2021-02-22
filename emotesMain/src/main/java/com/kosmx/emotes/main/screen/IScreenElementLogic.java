package com.kosmx.emotes.main.screen;

import com.kosmx.emotes.executor.dataTypes.IIdentifier;
import com.kosmx.emotes.executor.dataTypes.Text;

public interface IScreenElementLogic<MATRIX> {
    void renderSystemBlendColor(float r, float g, float b, float a);
    void drawableHelperFill(MATRIX matrices, int x1, int y1, int x2, int y2, int color);
    void textDrawWithShadow(MATRIX matrices, Text text, float x, float y, int color);
    void textDraw(MATRIX matrices, Text text, float x, float y, int color);
    int textRendererGetWidth(Text text);
    void renderBindTexture(IIdentifier texture);
    void renderEnableBend();
    void renderDisableBend();
    void renderDefaultBendFunction();
    void renderEnableDepthText();
    void drawableDrawTexture(MATRIX matrices, int x, int y, int width, int height, float u, float v, int regionWidth, int regionHeight, int textureWidth, int textureHeight);

}
