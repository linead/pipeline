package gradle

void call() {
  println "Testing the code"
  bat(
    label: "Run gradlew tasks 'test'",
    script: "gradlew test"
    )
  junit 'build/test-results/test/**/TEST-*.xml'
  junit 'build/test-results/test/**/TEST-*.xml'
}
