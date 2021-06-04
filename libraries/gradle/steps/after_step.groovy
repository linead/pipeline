package gradle

@AfterStep
def call() {
  println "Executing step $hookContext.step"
}
