package io.github.nyliummc.essentials.internal

import net.minecraft.server.MinecraftServer
import java.util.*

object TickScheduler {
    private val tasks: MutableMap<UUID, ScheduledTask> = mutableMapOf();

    fun tick(server: MinecraftServer) {
        val toRemove: MutableList<UUID> = mutableListOf();

        for (task in tasks) {
            if (task.value.ticks >= server.ticks) {
                task.value.task.invoke()
                toRemove.add(task.key)
            }
        }

        for (id in toRemove) {
            tasks.remove(id)
        }
    }

    fun schedule(server: MinecraftServer, ticks: Long, task: () -> Unit) : UUID {
        val id = UUID.randomUUID()
        tasks[id] = ScheduledTask(server.ticks + ticks, task)
        return id
    }

    private class ScheduledTask(val ticks: Long, val task: () -> Unit)
}
