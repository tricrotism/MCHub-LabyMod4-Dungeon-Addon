package com.tricrotism.mchub.util;

import com.tricrotism.mchub.MCHubDungeonTracker;
import net.labymod.api.client.chat.ChatMessage;
import net.labymod.api.client.chat.ChatTrustLevel;
import net.labymod.api.client.component.Component;
import net.labymod.api.client.options.ChatVisibility;

public class MessageUtil {

  private final MCHubDungeonTracker addon;

  public MessageUtil(MCHubDungeonTracker addon) {
    this.addon = addon;
  }

  public void sendChatMessage(String message) {
    addon.labyAPI().chatProvider().chatController().addMessage(ChatMessage.builder().component(
        Component.translatable(message)
    ).visibility(ChatVisibility.SHOWN).trustLevel(ChatTrustLevel.SYSTEM).build());
  }
}
