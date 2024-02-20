package com.tricrotism.mchub;

import net.labymod.api.client.gui.screen.widget.widgets.input.SwitchWidget.SwitchSetting;
import net.labymod.api.client.gui.screen.widget.widgets.input.TextFieldWidget.TextFieldSetting;
import net.labymod.api.configuration.loader.annotation.ParentSwitch;
import net.labymod.api.configuration.loader.property.ConfigProperty;

public class DungeonClosingConfig extends net.labymod.api.configuration.loader.Config{
  @ParentSwitch
  @SwitchSetting
  private ConfigProperty<Boolean> Enabled = new ConfigProperty<>(true);
  @SwitchSetting
  private final ConfigProperty<Boolean> showDungeonClosingInMessageToggle = new ConfigProperty<>(true);

  public ConfigProperty<Boolean> showDungeonClosingInMessageToggle() {
    return this.showDungeonClosingInMessageToggle;
  }

  @TextFieldSetting
  private final ConfigProperty<String> getDungeonClosingInMessage = new ConfigProperty<>("");

  public ConfigProperty<String> getDungeonClosingInMessage() {
    return this.getDungeonClosingInMessage;
  }
}
