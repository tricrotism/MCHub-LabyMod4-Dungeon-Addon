package com.tricrotism.mchub;

import net.labymod.api.addon.AddonConfig;
import net.labymod.api.client.gui.screen.widget.widgets.input.AdvancedSelectionWidget.AdvancedSelectionSetting;
import net.labymod.api.client.gui.screen.widget.widgets.input.SwitchWidget.SwitchSetting;
import net.labymod.api.client.gui.screen.widget.widgets.input.TextFieldWidget.TextFieldSetting;
import net.labymod.api.configuration.loader.annotation.ConfigName;
import net.labymod.api.configuration.loader.property.ConfigProperty;
import java.util.List;

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
