package com.tricrotism.mchub.config;

import net.labymod.api.client.gui.screen.widget.widgets.input.SwitchWidget.SwitchSetting;
import net.labymod.api.client.gui.screen.widget.widgets.input.TextFieldWidget.TextFieldSetting;
import net.labymod.api.configuration.loader.Config;
import net.labymod.api.configuration.loader.annotation.ParentSwitch;
import net.labymod.api.configuration.loader.property.ConfigProperty;

public class BossSpawnConfig extends Config {
  @ParentSwitch
  @SwitchSetting
  private final ConfigProperty<Boolean> showDungeonBossSpawnMessageToggle = new ConfigProperty<>(true);

  public ConfigProperty<Boolean> showDungeonBossSpawnMessageToggle() {
    return this.showDungeonBossSpawnMessageToggle;
  }

  @TextFieldSetting
  private final ConfigProperty<String> getDungeonBossSpawnMessage = new ConfigProperty<>("");

  public ConfigProperty<String> getDungeonBossSpawnMessage() {
    return this.getDungeonBossSpawnMessage;
  }

  @TextFieldSetting
  private final ConfigProperty<String> dungeonBossSpawnWebhookMessage = new ConfigProperty<>("A new boss has spawned in the dungeon!");

  public ConfigProperty<String> getDungeonBossSpawnWebhookMessage(){
    return this.dungeonBossSpawnWebhookMessage;
  }

  @TextFieldSetting
  private final ConfigProperty<String> dungeonBossSpawnWebhookCustomContent = new ConfigProperty<>("");

  public ConfigProperty<String> getDungeonBossSpawnWebhookCustomContent() {
    return this.dungeonBossSpawnWebhookCustomContent;
  }
}
