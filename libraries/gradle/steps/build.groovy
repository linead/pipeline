package gradle

void call() {
  println "Building the code"
  sh(
    label: "Run gradlew tasks 'clean bootwar testclasses'",
    script: "gradlew clean bootwar testclasses"
    )
}
