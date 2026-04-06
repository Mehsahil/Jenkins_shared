def call (String GitURL, String GitBranch){
    withCredentials ([gitUsernamePassword (credentialsId: "Github", gitToolName: "Default")]) {
        sh """
        echo "Updating Git repo to current image run version"

        echo "Checking repository status: "
        git status
                    
        echo "Adding changes to git: "
        git add .
        
        echo "Commiting changes: "
        git commit -m "Updated environment variables"
        
        echo "Pushing changes to github: "
        git push ${GitURL} ${GitBranch}

        """
    }
}
