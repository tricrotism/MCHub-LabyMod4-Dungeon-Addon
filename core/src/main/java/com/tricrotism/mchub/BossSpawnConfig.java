package com.tricrotism.mchub;

import net.labymod.api.client.gui.screen.widget.widgets.input.SwitchWidget.SwitchSetting;
import net.labymod.api.client.gui.screen.widget.widgets.input.TextFieldWidget.TextFieldSetting;
import net.labymod.api.configuration.loader.annotation.ParentSwitch;
import net.labymod.api.configuration.loader.property.ConfigProperty;

public class BossSpawnConfig extends net.labymod.api.configuration.loader.Config{
  @ParentSwitch
  @SwitchSetting
  private ConfigProperty<Boolean> Enabled = new ConfigProperty<>(true);

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
}
