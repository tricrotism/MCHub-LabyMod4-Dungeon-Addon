package com.tricrotism.mchub.config;

import com.tricrotism.mchub.config.BossSlainConfig;
import com.tricrotism.mchub.config.BossSpawnConfig;
import com.tricrotism.mchub.config.DungeonClosingConfig;
import com.tricrotism.mchub.config.DungeonStartConfig;
import net.labymod.api.addon.AddonConfig;
import net.labymod.api.client.gui.screen.widget.widgets.input.SwitchWidget.SwitchSetting;
import net.labymod.api.client.gui.screen.widget.widgets.input.TextFieldWidget.TextFieldSetting;
import net.labymod.api.configuration.loader.annotation.ConfigName;
import net.labymod.api.configuration.loader.property.ConfigProperty;
import net.labymod.api.configuration.settings.annotation.SettingSection;


@ConfigName("settings")
public class MainConfig extends AddonConfig {

  @SettingSection("mainSection")
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

  @SettingSection("messageSettings")
  private final DungeonStartConfig dungeonStartConfig = new DungeonStartConfig();

  public DungeonStartConfig getDungeonStartConfig() {
    return this.dungeonStartConfig;
  }

  private final DungeonClosingConfig dungeonClosingConfig = new DungeonClosingConfig();

  public DungeonClosingConfig getDungeonClosingConfig() {
    return this.dungeonClosingConfig;
  }

  private final BossSpawnConfig bossSpawnConfig = new BossSpawnConfig();

  public BossSpawnConfig getBossSpawnConfig() {
    return bossSpawnConfig;
  }

  private final BossSlainConfig bossSlainConfig = new BossSlainConfig();

  public BossSlainConfig getBossSlainConfig() {
    return bossSlainConfig;
  }
}
