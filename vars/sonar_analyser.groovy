def call(String SonarQubeName, String Projectname, String ProjectKey){
  withSonarQubeEnv("${SonarQubeName}"){
      sh "$SONAR_HOME/bin/sonar-scanner -Dsonar.projectName=${Projectname} -Dsonar.projectKey=${ProjectKey} -X"
  }
}
