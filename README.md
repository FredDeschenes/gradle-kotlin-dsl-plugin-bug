Application plugin is always applied to the root project, even if I don't want it to.

`./gradlew distTar` fails since `mainClassName` is not set on root project (in the `kotlin` directory).

Works as expected in the `groovy` directory.

Gradle issue : [https://github.com/gradle/kotlin-dsl/issues/916](https://github.com/gradle/kotlin-dsl/issues/916)
