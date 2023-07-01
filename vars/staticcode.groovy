def call(creds){
    withSonarQubeEnv(credentialsId: creds){
        sh 'mvn clean package sonar:sonar'

    }
    
}