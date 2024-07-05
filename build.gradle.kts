plugins {
    idea
}

idea {
    module {
        isDownloadJavadoc = true
        isDownloadSources = true
    }
}

tasks.wrapper {
    distributionType = Wrapper.DistributionType.ALL
}
