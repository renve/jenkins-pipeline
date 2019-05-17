void deployBackend() {
    sh(" KUBECONFIG='/var/jenkins_home/cluster.config' kubectl apply -f ./deployment/deployment.yaml")
}