plugins {
    id("com.github.jmongard.git-semver-plugin") version "0.12.10"
}

semver {
    // Do not create an empty release commit when running the "releaseVersion" task.
    createReleaseCommit = false

    // Do not let untracked files bump the version or add a "-SNAPSHOT" suffix.
    noDirtyCheck = true
}

version = semver.version
