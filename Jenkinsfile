pipeline {
    agent any
    
    properties([
     parameters([
        gitParameter(branch: '',
                     branchFilter: 'origin/(.*)',
                     defaultValue: 'master',
                     description: '',
                     name: 'BRANCH',
                     quickFilterEnabled: false,
                     selectedValue: 'NONE',
                     sortMode: 'NONE',
                     tagFilter: '*',
                     type: 'PT_BRANCH')
    ])
   ])
    
    stages {
        stage('Build') { 
            steps {
                echo "Building"
                git branch: "${params.BRANCH}", url: 'https://github.com/kalluriramkumar/java-jenkins.git'
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
