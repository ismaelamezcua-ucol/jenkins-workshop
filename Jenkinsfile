pipeline {
    agent any
    
    stages {
        stage ('Build') {
            steps {
                git branch: 'main', url: "https://github.com/ismaelamezcua-ucol/jenkins-workshop.git"
                echo 'Building'
                dir('a1-basic-building') {
                    sh 'mvn test'
                    sh 'mvn clean package'
                }
            }

        }
    }
}
