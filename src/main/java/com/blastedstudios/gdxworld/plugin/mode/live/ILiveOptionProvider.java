package com.blastedstudios.gdxworld.plugin.mode.live;

import net.xeoh.plugins.base.Plugin;
import net.xeoh.plugins.base.annotations.PluginImplementation;

import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.blastedstudios.gdxworld.ui.AbstractWindow;

@PluginImplementation
public interface ILiveOptionProvider extends Plugin{
	Table getTable(Skin skin, AbstractWindow window);
}
