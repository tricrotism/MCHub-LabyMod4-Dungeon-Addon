package com.tricrotism.mchub;

import net.labymod.api.client.gui.screen.widget.widgets.input.SwitchWidget.SwitchSetting;
import net.labymod.api.client.gui.screen.widget.widgets.input.TextFieldWidget.TextFieldSetting;
import net.labymod.api.configuration.loader.annotation.ParentSwitch;
import net.labymod.api.configuration.loader.property.ConfigProperty;

public class DungeonStartConfig extends net.labymod.api.configuration.loader.Config{
  @ParentSwitch
  @SwitchSetting
  private ConfigProperty<Boolean> Enabled = new ConfigProperty<>(true);

  @SwitchSetting
  private final ConfigProperty<Boolean> showDungeonStartMessageToggle = new ConfigProperty<>(true);

  public ConfigProperty<Boolean> showDungeonStartMessageToggle() {
    return this.showDungeonStartMessageToggle;
  }

  @TextFieldSetting
  private final ConfigProperty<String> getDungeonStartMessage = new ConfigProperty<>("");

  public ConfigProperty<String> getDungeonStartMessage() {
    return this.getDungeonStartMessage;
  }

  @TextFieldSetting
  private final ConfigProperty<String> dungeonStartWebhookMessage = new ConfigProperty<>("A new dungeon has opened on MCHub!");

  public ConfigProperty<String> dungeonStartWebhookMessage(){
    return this.dungeonStartWebhookMessage;
  }
}
