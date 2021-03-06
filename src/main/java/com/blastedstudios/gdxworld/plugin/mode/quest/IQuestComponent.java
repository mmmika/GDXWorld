package com.blastedstudios.gdxworld.plugin.mode.quest;

import net.xeoh.plugins.base.Plugin;

import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.blastedstudios.gdxworld.world.quest.ICloneable;

public interface IQuestComponent extends Plugin{
	public String getBoxText();
	public ICloneable getDefault();
	public Table createTable(Skin skin, Object object);

	public interface IQuestComponentManifestation extends IQuestComponent{}
	public interface IQuestComponentTrigger extends IQuestComponent{}
}
