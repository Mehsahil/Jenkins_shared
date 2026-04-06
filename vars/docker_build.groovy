def call (String ImageName, String ImageTag, String Directory) {
    withCredentials([usernamePassword(
        credentialsId : "Docker",
        passwordVariable :"DockerPass",
        usernameVariable :"DockerUser")]) {
           echo " Initiating docker build for ${Directory}"
           sh "docker build -t ${DockerUser}/${ImageName}:${ImageTag} ."  
    }
    echo "Build completed for image of ${Directory}"
}
