/*
 * MIT License
 *
 * Copyright (c) GunpowderMC
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

package io.github.gunpowder.api

import net.minecraft.server.world.ServerWorld
import net.minecraft.util.registry.RegistryKey
import net.minecraft.world.World
import net.minecraft.world.dimension.DimensionType
import net.minecraft.world.gen.chunk.ChunkGenerator
import net.minecraft.world.level.ServerWorldProperties

interface GunpowderDimensionManager {
    fun hasDimensionType(dimensionTypeId: RegistryKey<DimensionType>): Boolean

    /**
     * Note: Dimension Types do not persist naturally. While their dimensions are saved, they must be re-created
     *  by your mod to ensure the dimension loads correctly.
     */
    fun addDimensionType(dimensionTypeId: RegistryKey<DimensionType>, dimensionType: DimensionType)
    fun removeDimensionType(dimensionTypeId: RegistryKey<DimensionType>)

    fun hasWorld(worldId: RegistryKey<World>): Boolean
    /**
     * Note: Worlds do not persist naturally. While their world data is saved, they must be re-created
     *  by your mod to ensure the world loads correctly, otherwise users will be moved to the overworld on load.
     */
    fun addWorld(worldId: RegistryKey<World>, dimensionTypeId: RegistryKey<DimensionType>, chunkGenerator: ChunkGenerator, properties: ServerWorldProperties): ServerWorld
    fun removeWorld(worldId: RegistryKey<World>)
}
