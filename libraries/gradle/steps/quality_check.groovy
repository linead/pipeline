package gradle

void call() {
  println "Quality Checking the code"
  bat(
    label: "Run gradlew tasks 'spotbugsMain spotbugsTest'",
    script: "gradlew spotbugsMain spotbugsTest"
    )
}
