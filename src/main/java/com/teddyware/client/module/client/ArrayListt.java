package com.teddyware.client.module.client;

import com.teddyware.api.util.color.JColor;
import com.teddyware.client.module.Category;
import com.teddyware.client.module.Module;
import com.teddyware.client.setting.settings.BooleanSetting;
import com.teddyware.client.setting.settings.ColorSetting;
import org.lwjgl.input.Keyboard;

public class ArrayListt extends Module {

    public ArrayListt() {
        super("ArrayList", "Shows which modules are toggled", Keyboard.KEY_NONE, Category.Client);
    }

    @Override
    public void onEnable() { }
    @Override
    public void onDisable() { }
}
