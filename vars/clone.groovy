def call (String GitURL, String GitBranch){
    echo "Git repo clone will start.."
    git url :"${GitURL}", branch : "${GitBranch}"
}
