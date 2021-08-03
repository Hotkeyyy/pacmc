package net.axay.pacmc.logging

import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.rendering.TextStyles.*
import com.github.ajalt.mordant.terminal.Terminal
import net.axay.pacmc.data.MinecraftVersion
import net.axay.pacmc.data.ReleaseType
import net.axay.pacmc.requests.common.data.CommonModResult
import net.axay.pacmc.requests.curse.data.CurseProxyProject
import net.axay.pacmc.storage.data.DbArchive
import net.axay.pacmc.terminal

private val versionChars = arrayOf('.', '-', '+', '_', ' ')

fun Terminal.printProject(
    project: CommonModResult,
    minecraftVersion: MinecraftVersion?,
    showAll: Boolean = true,
) {
    val version =
        if (minecraftVersion != null && !project.gameVersions.contains(minecraftVersion))
            if (showAll) red("not available for $minecraftVersion") else return
        else if (project.gameVersions.isEmpty())
            red(italic("no version info"))
        else ""

    val repo = yellow("${project.repository}/")
    val projectName = white(bold(underline(project.name)))
    val id = brightBlue("[${project.id}]")
    val author = "by ${project.author}"

    this.println("$repo$projectName $id $author $version")
    this.println("  ${gray(project.description)}")
}

fun Terminal.printProject(
    project: CurseProxyProject,
    minecraftVersion: String?,
    showAll: Boolean = true,
) {
    val repo = yellow("curseforge/")
    val id = brightBlue("[${project.id}]")
    val projectName = white(bold(underline(project.name)))
    val author = "by ${project.authors.firstOrNull()?.name ?: italic("unknown author")}"
    val version = project.getLatestVersion(minecraftVersion)
        ?.let { latest ->
            val versionString = latest.first.lowercase().trim { it in versionChars || it.isLetter() }
            if (versionString.isNotEmpty()) {
                green(bold(versionString)).let {
                    when (latest.second) {
                        ReleaseType.BETA -> it + cyan(" (beta)")
                        ReleaseType.ALPHA -> it + magenta(" (alpha)")
                        else -> it
                    }
                }
            } else red(italic("no version info"))
        }
        ?: if (minecraftVersion != null)
            if (showAll) red("not available for $minecraftVersion") else return
        else
            red(italic("no file info"))

    this.println("$repo$projectName $id $author $version")
    this.println("  ${gray(project.summary)}")
}

fun Terminal.printArchive(archive: DbArchive) {
    terminal.println("${red(archive.name)} at ${gray(archive.path)}")
}
