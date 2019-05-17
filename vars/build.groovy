void buildImage(String imageName) {
    //def sampleAppImage = docker.build(imageName) 
    //sampleAppImage.push()
    sh("docker build -t ${imageName} .")
    sh("docker push ${imageName}")
}