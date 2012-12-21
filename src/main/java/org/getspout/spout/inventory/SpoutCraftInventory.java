/*
 * This file is part of SpoutPlugin.
 *
 * Copyright (c) 2011-2012, Spout LLC <http://www.spout.org/>
 * SpoutPlugin is licensed under the GNU Lesser General Public License.
 *
 * SpoutPlugin is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * SpoutPlugin is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.getspout.spout.inventory;

import net.minecraft.server.v1_4_6.IInventory;

import org.bukkit.craftbukkit.v1_4_6.inventory.CraftInventory;

public class SpoutCraftInventory extends CraftInventory {
	protected String name = null;
	public SpoutCraftInventory(IInventory inventory) {
		super(inventory);
	}

	public String getName() {
		if (name == null) {
			return this.inventory.getName();
		}
		return name;
	}

	public void setName(String title) {
		this.name = title;
	}
}
