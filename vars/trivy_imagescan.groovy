def call (String ImageName, String ImageTag, String Directory) {
    withCredentials([usernamePassword(
        credentialsId:"Docker", 
        usernameVariable : "DockerUser")]) {
            sh "trivy image ${DockerUser}/${ImageName}:${ImageTag} > trivy-${Directory}-image.txt"
        }
}
