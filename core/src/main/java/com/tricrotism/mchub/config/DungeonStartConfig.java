package com.tricrotism.mchub.config;

import net.labymod.api.client.gui.screen.widget.widgets.input.SwitchWidget.SwitchSetting;
import net.labymod.api.client.gui.screen.widget.widgets.input.TextFieldWidget.TextFieldSetting;
import net.labymod.api.configuration.loader.Config;
import net.labymod.api.configuration.loader.annotation.ParentSwitch;
import net.labymod.api.configuration.loader.property.ConfigProperty;

public class DungeonStartConfig extends Config {

  @ParentSwitch
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
  private final ConfigProperty<String> dungeonStartWebhookMessage = new ConfigProperty<>(
      "A new dungeon has opened on MCHub!");

  public ConfigProperty<String> dungeonStartWebhookMessage() {
    return this.dungeonStartWebhookMessage;
  }

  @TextFieldSetting
  private final ConfigProperty<String> dungeonStartWebhookCustomContent = new ConfigProperty<>("");

  public ConfigProperty<String> getDungeonStartWebhookCustomContent() {
    return this.dungeonStartWebhookCustomContent;
  }
}
