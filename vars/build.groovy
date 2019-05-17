void buildImage(String imageName) {
    def sampleAppImage = docker.build(imageName) 
    sampleAppImage.push()
}