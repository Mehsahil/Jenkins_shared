def call (String ImageName, String ImageTag, String Directory) {
    withCredentials (usernamePassword[
        credentialsId:"Docker",
        passwordVariable: "DockerPass",
        usernameVariable: "DockerUser"]) {
            echo "Checking Inn Docker Login.. "
            sh " docker login -u ${DockerUser} -p ${DockerPass}"

            echo " Build image is now being pushed to DockerHub"
            sh "docker push ${DockerUser}/${ImageName}:${ImageTag}"
        }
        echo "Docker image has been pushed for directory : '${Directory}'"
}
