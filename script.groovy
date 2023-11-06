def buildJar() {
    echo "building the application..."
    sh 'mvn package'
} 

def buildImage() {
    echo "building the docker image..."
    // withCredentials([usernamePassword(credentialsId: 'docker-hub', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
    //     sh 'docker build -t [repository_name/repository_tag:imageID] .'
    //     sh "echo $PASS | docker login -u $USER --password-stdin"
    //     sh 'docker push [repository_name/repository_tag:imageID]'
    }
} 

def deployApp() {
    echo 'deploying the application...'
} 

return this
