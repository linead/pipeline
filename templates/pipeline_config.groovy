stages {
  stage_checkout {
    checkout
  }
  stage_build {
    build
  }
  stage_test {
    test
  }
}

libraries {
  gradle
  common
}
