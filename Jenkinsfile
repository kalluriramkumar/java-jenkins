pipeline {
    agent any
    parameters {
        gitParameter branchFilter: '.*', defaultValue: 'master', name: 'BRANCH', type: 'PT_BRANCH'
    }

    stages {
        stage('Build') { 
            steps {
                echo "Building"
                git branch: "${params.BRANCH}", url: 'https://github.com/kalluriramkumar/java-jenkins.git'
                echo "Branch : ${params.BRANCH}"
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
