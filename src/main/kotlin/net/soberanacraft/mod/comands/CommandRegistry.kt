package net.soberanacraft.mod.comands

object CommandRegistry {
    fun init () {
        InviteCommand.register()
        LinkCommand.register()
    }
}