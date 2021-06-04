package gradle

void call() {
  println "Building the code"
  sh(
    label: "Run gradlew tasks 'clean bootjar testclasses'",
    script: "gradlew clean bootwar testclasses"
    )
}
