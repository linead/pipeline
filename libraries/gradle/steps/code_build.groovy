package gradle

void call() {
  println "Building the code"
  
  String img = """sample"""
  add_unmanaged_img("${img}","${img}")
}

def add_unmanaged_img (id, name) {
  config.imgs = config.imgs ?: [:]
  config.imgs[id] = [
    name: name,
    unmanaged: true
  ]
}
