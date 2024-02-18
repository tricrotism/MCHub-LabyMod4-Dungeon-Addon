package com.tricrotism.mchub;

import net.labymod.api.addon.AddonConfig;
import net.labymod.api.client.gui.screen.widget.widgets.input.SwitchWidget.SwitchSetting;
import net.labymod.api.client.gui.screen.widget.widgets.input.TextFieldWidget.TextFieldSetting;
import net.labymod.api.configuration.loader.annotation.ConfigName;
import net.labymod.api.configuration.loader.annotation.SpriteSlot;
import net.labymod.api.configuration.loader.property.ConfigProperty;
import net.labymod.api.configuration.settings.annotation.SettingSection;

@ConfigName("settings")
public class Config extends AddonConfig {

  @SwitchSetting
  private final ConfigProperty<Boolean> enabled = new ConfigProperty<>(true);

  @Override
  public ConfigProperty<Boolean> enabled() {
    return this.enabled;
  }

  @TextFieldSetting
  private final ConfigProperty<String> webhook = new ConfigProperty<>("");

  public ConfigProperty<String> webhook() {
    return this.webhook;
  }

  @TextFieldSetting
  private final ConfigProperty<String> webhookImageURL = new ConfigProperty<>("");

  public ConfigProperty<String> webhookImageURL() {
    return this.webhookImageURL;
  }

  @SwitchSetting
  private final ConfigProperty<Boolean> showDungeonStartMessage = new ConfigProperty<>(true);

  public ConfigProperty<Boolean> showDungeonStartMessage() {
    return this.showDungeonStartMessage;
  }

  @SwitchSetting
  private final ConfigProperty<Boolean> showDungeonBossSpawnMessage = new ConfigProperty<>(true);

  public ConfigProperty<Boolean> showDungeonBossSpawnMessage() {
    return this.showDungeonBossSpawnMessage;
  }

  @SwitchSetting
  private final ConfigProperty<Boolean> showDungeonClosingInMessage = new ConfigProperty<>(true);

  public ConfigProperty<Boolean> showDungeonClosingInMessage() {
    return this.showDungeonClosingInMessage;
  }

  @SwitchSetting
  private final ConfigProperty<Boolean> showDungeonBossSlainMessage = new ConfigProperty<>(true);

  public ConfigProperty<Boolean> showDungeonBossSlainMessage() {
    return this.showDungeonBossSlainMessage;
  }
}
