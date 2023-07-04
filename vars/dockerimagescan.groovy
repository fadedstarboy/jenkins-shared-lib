def call(String project,String ImageTag, String hubUser){
    sh """
    trivy image ${hubUser}/${project}:latest > trivyscan.txt
    cat scan.txt
    """
}