package gradle

void call() {
  println "Testing the code"
  bat(
    label: "Run gradlew tasks 'test'",
    script: "gradlew test componentTest"
    )
  junit 'build/test-results/test/**/TEST-*.xml'
  zip zipFile: 'unit-test-results.zip', dir: 'build/test-results/test/', archive: true
  bat "del /F /Q 'unit-test-results.zip'"
  junit 'build/test-results/componentTest/**/TEST-*.xml'
  zip zipFile: 'component-test-results.zip', dir: 'build/test-results/componentTest/', archive: true
  bat "del /F /Q 'component-test-results.zip'"
}
