package com.tricrotism.mchub.listener;

import com.tricrotism.mchub.MCHubDungeonTracker;
import com.tricrotism.mchub.util.MessageUtil;
import net.labymod.api.event.Subscribe;
import net.labymod.api.event.client.network.server.ServerJoinEvent;

public class PlayerJoinServerListener {

  private final MCHubDungeonTracker addon;

  public PlayerJoinServerListener(MCHubDungeonTracker addon) {
    this.addon = addon;
  }

  @Subscribe
  public void onLogin(ServerJoinEvent event) {
    if (addon.configuration().enabled().get() && addon.configuration().webhook().get().isEmpty()) {
      System.out.println(event.serverData().address());
      if (event.serverData().address().getAddress().getHostString().contains("mchub.com")) {
        MessageUtil messageUtil = new MessageUtil(addon);
        messageUtil.sendChatMessage("§cMCHub Dungeon Tracker: §7Webhook URL is not set!");
      }
    }
  }

}
