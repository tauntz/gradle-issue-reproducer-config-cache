tasks.register("hello") {
    dependsOn(gradle.includedBuild("common").task(":hello"))
}
