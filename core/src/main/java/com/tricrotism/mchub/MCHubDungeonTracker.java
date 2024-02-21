package com.tricrotism.mchub;

import com.tricrotism.mchub.config.MainConfig;
import com.tricrotism.mchub.listener.DungeonChatMessageListener;
import com.tricrotism.mchub.listener.PlayerJoinServerListener;
import net.labymod.api.addon.LabyAddon;
import net.labymod.api.models.addon.annotation.AddonMain;

@AddonMain
public class MCHubDungeonTracker extends LabyAddon<MainConfig> {

  @Override
  protected void enable() {
    this.registerSettingCategory();

    this.registerListener(new DungeonChatMessageListener(this));
    this.registerListener(new PlayerJoinServerListener(this));

    this.logger().info("Enabled the MCHub Dungeons Addon");
  }

  @Override
  protected Class<MainConfig> configurationClass() {
    return MainConfig.class;
  }

}
