import kotlin.IllegalArgumentException

plugins {
    id("com.google.cloud.tools.jib")
}

jib {
    from {
        image = "openjdk:15-alpine"
    }

    to {
        // todo - Find a better solution to deal with credentials
        auth {
            username = "marffm1109"
            password = "Mar8427Bia"
        }

        val imageName = project.findProperty("imageName")?.toString() ?:
            throw IllegalArgumentException("Missing image name on gradle.properties.")

        image = "marffm1109/$imageName"
    }
}