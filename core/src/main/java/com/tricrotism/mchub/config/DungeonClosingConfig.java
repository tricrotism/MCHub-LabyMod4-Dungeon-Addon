package com.tricrotism.mchub.config;

import net.labymod.api.client.gui.screen.widget.widgets.input.SwitchWidget.SwitchSetting;
import net.labymod.api.client.gui.screen.widget.widgets.input.TextFieldWidget.TextFieldSetting;
import net.labymod.api.configuration.loader.Config;
import net.labymod.api.configuration.loader.annotation.ParentSwitch;
import net.labymod.api.configuration.loader.property.ConfigProperty;

public class DungeonClosingConfig extends Config {
  @ParentSwitch
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

  @TextFieldSetting
  private final ConfigProperty<String> dungeonClosingWebhookCustomContent = new ConfigProperty<>("");

  public ConfigProperty<String> getDungeonClosingWebhookCustomContent() {
    return this.dungeonClosingWebhookCustomContent;
  }
}
