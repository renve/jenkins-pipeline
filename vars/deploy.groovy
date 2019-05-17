void deployBackend() {
    sh("kubectl apply -f ./deployment/deployment.yaml")
}