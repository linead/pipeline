@merge jte {
  allow_scm_jenkinsfile = false
}

stages {
  stage_checkout {
    code_checkout
  }
  stage_build {
    code_build
  }
  stage_test {
    code_test
  }
  stage_quality_check {
    quality_check
  }
}

libraries {
  gradle
  common
}
