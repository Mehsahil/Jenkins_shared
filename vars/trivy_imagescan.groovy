def call (String ImageName, String ImageTag) {
    withCredentials([usernamePassword(
        credentialsId:"Docker", 
        usernameVariable : "DockerUser")]) {
            sh "trivy image ${DockerUser}/${ImageName}:${ImageTag} --severity CRITICAL,HIGH"
        }
}
