pipeline {
    agent any
    
    stages {
        stage('Build') { 
            steps {
                echo "Building"
                git branch: "${env.GIT_BRANCH}", url: 'https://github.com/kalluriramkumar/java-jenkins.git'
            }
        }
        stage('Test') { 
            steps {
                echo "Testing" 
            }
        }
        stage('Deploy') { 
            steps {
                echo "Deploying"
            }
        }
    }
}
