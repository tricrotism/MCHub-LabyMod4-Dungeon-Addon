package com.tricrotism.mchub;

import net.labymod.api.addon.AddonConfig;
import net.labymod.api.client.gui.screen.widget.widgets.input.SwitchWidget.SwitchSetting;
import net.labymod.api.client.gui.screen.widget.widgets.input.TextFieldWidget.TextFieldSetting;
import net.labymod.api.configuration.loader.annotation.ConfigName;
import net.labymod.api.configuration.loader.property.ConfigProperty;

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
}
