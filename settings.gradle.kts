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
//    versionCatalogs {
//        create("libs") {
//            from(files("./gradle/libs.versions.toml"))
//        }
//    }
}

rootProject.name = "TrackWise"
include(":trackwise-app")
include(":dashboard-framework")
include(":dashboard-widgets")
include(":transaction-module")
