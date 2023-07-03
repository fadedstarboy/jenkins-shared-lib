def call(creds){
    waitForQualityGate abortPipeline: False, credentialsId: creds
    
}