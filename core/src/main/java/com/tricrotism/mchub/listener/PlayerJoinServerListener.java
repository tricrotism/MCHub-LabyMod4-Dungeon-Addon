package com.tricrotism.mchub.listener;

import com.tricrotism.mchub.MCHubDungeonTracker;
import net.labymod.api.client.chat.ChatMessage;
import net.labymod.api.client.chat.ChatTrustLevel;
import net.labymod.api.client.component.Component;
import net.labymod.api.client.options.ChatVisibility;
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
        addon.labyAPI().chatProvider().chatController().addMessage(ChatMessage.builder().component(
            Component.translatable("§cMCHub Dungeon Tracker: §7Webhook URL is not set!")
        ).visibility(ChatVisibility.SHOWN).trustLevel(ChatTrustLevel.SYSTEM).build());
      }
    }
  }

}
