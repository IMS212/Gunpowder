/*
 * MIT License
 *
 * Copyright (c) NyliumMC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package io.github.nyliummc.essentials.entities

import org.dynmap.DynmapLocation
import org.dynmap.common.DynmapPlayer
import java.net.InetSocketAddress

class FabricDynmapOfflinePlayer(private val name: String) : DynmapPlayer {
    private var weight = 0

    override fun isSneaking(): Boolean {
        return false
    }

    override fun getName(): String {
        return name
    }

    override fun isOp(): Boolean {
        return false
    }

    override fun isConnected(): Boolean {
        return false
    }

    override fun getFirstLoginTime(): Long {
        // TODO
        return 0
    }

    override fun hasPrivilege(p0: String?): Boolean {
        // TODO
        return false
    }

    override fun getLastLoginTime(): Long {
        // TODO
        return 0
    }

    override fun getHealth(): Double {
        return 20.0
    }

    override fun hasPermissionNode(p0: String?): Boolean {
        // TODO
        return false
    }

    override fun getArmorPoints(): Int {
        return 0
    }

    override fun getWorld(): String {
        // TODO
        return "world"
    }

    override fun isOnline(): Boolean {
        return false
    }

    override fun sendMessage(p0: String?) {
        // TODO
    }

    override fun isInvisible(): Boolean {
        return false
    }

    override fun getLocation(): DynmapLocation {
        // TODO
        return DynmapLocation("world", 0.0, 0.0, 0.0)
    }

    override fun getBedSpawnLocation(): DynmapLocation? {
        return DynmapLocation("world", 0.0, 0.0, 0.0)
    }

    override fun getDisplayName(): String {
        return name
    }

    override fun getSortWeight(): Int {
        return weight
    }

    override fun setSortWeight(p0: Int) {
        weight = p0
    }

    override fun getAddress(): InetSocketAddress? {
        return null
    }
}
