pipeline {
    agent any

    if (getBinding().hasVariable("BRANCH_NAME")) {
    // override default branch from build parameter
    branch_name = BRANCH_NAME
    echo $BRANCH_NAME
    }   
    stages {
        stage('Build') { 
            steps {
                echo "Building" 
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
