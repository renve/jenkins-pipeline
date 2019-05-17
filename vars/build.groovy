void buildImage(String imageName) {
    //def sampleAppImage = docker.build(imageName) 
    //sampleAppImage.push()
    sh("docker build -t ${imageName} .")
    withCredentials([
        usernamePassword(credentialsId: "docker", usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASSWORD')
    ]){
        sh("docker login --username=${DOCKER_USER} --password=${DOCKER_PASSWORD}")
        sh("docker push ${imageName}")
    }
}