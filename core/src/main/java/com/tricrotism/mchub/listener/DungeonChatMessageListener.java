package com.tricrotism.mchub.listener;

import com.tricrotism.mchub.DiscordWebhook;
import com.tricrotism.mchub.MCHubDungeonTracker;
import com.tricrotism.mchub.util.MessageUtil;
import net.labymod.api.event.Subscribe;
import net.labymod.api.event.client.chat.ChatReceiveEvent;
import java.awt.*;
import java.io.IOException;

public class DungeonChatMessageListener {

  private final MCHubDungeonTracker addon;

  public DungeonChatMessageListener(MCHubDungeonTracker addon) {
    this.addon = addon;
  }

  @Subscribe
  public void onChatReceive(ChatReceiveEvent event) {
    String mainMessage = "Dungeons » ";
    if (!event.chatMessage().getPlainText().contains(mainMessage)) {
      return;
    }

    if (this.addon.configuration().webhook().get().isBlank()) {
      return;
    }

    DiscordWebhook webhook = new DiscordWebhook(this.addon.configuration().webhook().get());

    if (this.addon.configuration().webhookImageURL().get() != null) {
      webhook.setAvatarUrl(this.addon.configuration().webhookImageURL().get());
    } else {
      webhook.setAvatarUrl(
          "https://cdn.discordapp.com/avatars/256116115422314496/1a69f18e8e9405ed31f26b637df752b4.png");
    }
    webhook.setUsername("MCHub Dungeons");

    //Dungeon Start

    if (event.chatMessage().getPlainText()
        .contains("A new dungeon has opened! You can join the dungeon by typing /dungeon!")
        || event.chatMessage().getPlainText().contains("A dungeon is currently open!")) {

//
        if (!this.addon.configuration().getDungeonStartConfig().showDungeonStartMessageToggle().get()) {
          return;
        }

      Thread thread = new Thread(() -> {
        webhook.addEmbed(new DiscordWebhook.EmbedObject()
            .setTitle("Dungeon")
            .setDescription(this.addon.configuration().getDungeonStartConfig().dungeonStartWebhookMessage().get())
            .setColor(Color.CYAN));
        try {
          webhook.execute();
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
        this.addon.logger().info("[DUNGEON] Dungeon is open");

        if (this.addon.configuration().getDungeonStartConfig().getDungeonStartMessage().get().isBlank()) {
          return;
        }

        //Dungeon Boss Spawn

        MessageUtil messageUtil = new MessageUtil(addon);
        messageUtil.sendChatMessage(this.addon.configuration().getDungeonStartConfig().getDungeonStartMessage().get().replaceAll("&", "§"));
      });
      thread.start();
    } else if (event.chatMessage().getPlainText().contains("The dungeon boss has spawned!")) {
      if (!this.addon.configuration().getBossSpawnConfig().showDungeonBossSpawnMessageToggle().get()) {
        return;
      }

      Thread thread = new Thread(() -> {
        webhook.addEmbed(new DiscordWebhook.EmbedObject()
            .setTitle("Dungeon")
            .setDescription(this.addon.configuration().getBossSpawnConfig().getDungeonBossSpawnWebhookMessage().get())
            .setColor(Color.MAGENTA));
        try {
          webhook.execute();
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
        this.addon.logger().info("[DUNGEON] Boss spawned");

        if (this.addon.configuration().getBossSpawnConfig().getDungeonBossSpawnMessage().get().isBlank()) {
          return;
        }

        //Dungeon Closing

        MessageUtil messageUtil = new MessageUtil(addon);
        messageUtil.sendChatMessage(this.addon.configuration().getBossSpawnConfig().getDungeonBossSpawnMessage().get().replaceAll("&", "§"));
      });
      thread.start();
    } else if (event.chatMessage().getPlainText().contains("The dungeon will be closing in ")) {
      if (!this.addon.configuration().getDungeonClosingConfig().showDungeonClosingInMessageToggle().get()) {
        return;
      }

      Thread thread = new Thread(() -> {
        webhook.addEmbed(new DiscordWebhook.EmbedObject()
            .setTitle("Dungeon")
            .setDescription("The dungeon is closing in " + event.chatMessage().getPlainText().split("The dungeon will be closing in ")[1].split(" ")[0] + " minutes!")
            .setColor(Color.RED));
        try {
          webhook.execute();
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
        this.addon.logger().info("[DUNGEON] Dungeon is closing soon");

        if (this.addon.configuration().getDungeonClosingConfig().getDungeonClosingInMessage().get().isBlank()) {
          return;
        }

        //Dungeon Boss Killed

        MessageUtil messageUtil = new MessageUtil(addon);
        messageUtil.sendChatMessage(this.addon.configuration().getDungeonClosingConfig().getDungeonClosingInMessage().get().replaceAll("&", "§"));
      });
      thread.start();
    } else if (event.chatMessage().getPlainText().contains("The dungeon boss has been slain!")) {
      if (!this.addon.configuration().getBossSlainConfig().showDungeonBossSlainMessageToggle().get()) {
        return;
      }

      Thread thread = new Thread(() -> {
        webhook.addEmbed(new DiscordWebhook.EmbedObject()
            .setTitle("Dungeon")
            .setDescription(this.addon.configuration().getBossSlainConfig().getDungeonBossSlainWebhookMessage().get())
            .setColor(Color.ORANGE));
        try {
          webhook.execute();
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
        this.addon.logger().info("[DUNGEON] Boss slain");

        if (this.addon.configuration().getBossSlainConfig().getDungeonBossSlainMessage().get().isBlank()) {
          return;
        }
        MessageUtil messageUtil = new MessageUtil(addon);
        messageUtil.sendChatMessage(this.addon.configuration().getBossSlainConfig().getDungeonBossSlainMessage().get().replaceAll("&", "§"));
      });
      thread.start();
    } else {
      this.addon.logger().info("[DUNGEON] Unknown message");
    }
  }
}
