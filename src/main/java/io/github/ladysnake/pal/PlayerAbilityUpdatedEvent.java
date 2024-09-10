/*
 * PlayerAbilityLib
 * Copyright (C) 2019-2024 Ladysnake
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; If not, see <https://www.gnu.org/licenses>.
 */
package io.github.ladysnake.pal;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.event.entity.player.PlayerEvent;

/**
 * Callback interface for receiving ability update events.
 *
 * @see PlayerAbilityEnableEvent
 */
public class PlayerAbilityUpdatedEvent extends PlayerEvent {
    PlayerAbility ability;
    boolean nowEnable;
    public PlayerAbilityUpdatedEvent(PlayerEntity player, PlayerAbility ability, boolean nowEnable) {
        super(player);
        this.ability = ability;
        this.nowEnable = nowEnable;
    }

    public PlayerAbility getAbility() {
        return ability;
    }

    public boolean isNowEnable() {
        return nowEnable;
    }
}
