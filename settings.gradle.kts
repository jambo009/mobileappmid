pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "My Application"
include(":app")
include(":w03kakaoemail")
include(":w03")
include(":w04keypad")
include(":w04profile")
include(":w04grid")
include(":w04overalpped")
include(":w5counter")
include(":w5stopwatch")
include(":w05touch")
include(":w06bubblegame")
include(":myapp")
