def call (String DockerHubName, String ImageName, String ImageName, String Directory) {
    echo " Initiating docker build for ${Directory}"
    sh "docker build -t ${DockerHubName}/${ImageName}:${ImageName}"
    echo "Build completed for image of ${Directory}"
}
