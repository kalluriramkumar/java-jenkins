pipeline {
    agent any
    
    parameters {
     gitParameter(
      branch: '',
      branchFilter: ".*",
      defaultValue: "",
      description: '',
      listSize: '10',
      name: 'Version',
      quickFilterEnabled: false,
      selectedValue: 'NONE',
      sortMode: 'ASCENDING_SMART',
      tagFilter: "*",
      type: 'PT_BRANCH_TAG',
      useRepository: 'git@github.com:foo/bar.git')
   }     



    stages {
        stage('Build') { 
            steps {
                echo "Building"
                git branch: "${params.BRANCH}", url: 'https://github.com/kalluriramkumar/java-jenkins.git'
                echo "Branch : ${params.BRANCH}"
                echo "${params.Version}"
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
