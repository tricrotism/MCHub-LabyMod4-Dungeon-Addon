package com.tricrotism.mchub;

import net.labymod.api.client.gui.screen.widget.widgets.input.SwitchWidget.SwitchSetting;
import net.labymod.api.client.gui.screen.widget.widgets.input.TextFieldWidget.TextFieldSetting;
import net.labymod.api.configuration.loader.annotation.ParentSwitch;
import net.labymod.api.configuration.loader.property.ConfigProperty;

public class BossSlainConfig extends net.labymod.api.configuration.loader.Config{
  @ParentSwitch
  @SwitchSetting
  private ConfigProperty<Boolean> Enabled = new ConfigProperty<>(true);

  @SwitchSetting
  private final ConfigProperty<Boolean> showDungeonBossSlainMessageToggle = new ConfigProperty<>(true);

  public ConfigProperty<Boolean> showDungeonBossSlainMessageToggle() {
    return this.showDungeonBossSlainMessageToggle;
  }

  @TextFieldSetting
  private final ConfigProperty<String> getDungeonBossSlainMessage = new ConfigProperty<>("");

  public ConfigProperty<String> getDungeonBossSlainMessage() {
    return this.getDungeonBossSlainMessage;
  }

  @TextFieldSetting
  private final ConfigProperty<String> dungeonBossSlainWebhookMessage = new ConfigProperty<>("The dungeon boss has been slain!");

  public ConfigProperty<String> getDungeonBossSlainWebhookMessage(){
    return this.dungeonBossSlainWebhookMessage;
  }
}
