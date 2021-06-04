package gradle

void call() {
  println "Building the code"
  bat(
    label: "Run gradlew tasks 'clean bootJar testclasses'",
    script: "gradlew clean bootwar testclasses"
    )
}
