package gradle

void call() {
  println "Building the code"
  bat(
    label: "Run gradlew tasks 'clean bootJar testclasses'",
    script: "gradlew clean bootJar testclasses"
    )
  
  String img = "sample"
  add_unmanaged_img("${img}","${img}")
}

def add_unmanaged_img (id, name) {
  config.imgs = config.imgs ?: [:]
  config.imgs[id] = [
    name: name,
    unmanaged: true
  ]
}
