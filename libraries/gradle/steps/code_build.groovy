package gradle

void call() {
  println "Building the code"
  bat(
    label: "Run gradlew tasks 'clean bootjar testclasses'",
    script: "gradlew clean bootwar testclasses"
    )
}
