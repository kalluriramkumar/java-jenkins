pipeline {
   agent any

   stages {
      stage('Build') {
         steps {
            // Get some code from a GitHub repository
            git url:'https://github.com/kalluriramkumar/java-jenkins.git'

            // Run Maven on a Unix agent.
            sh "mvn clean package"

            // To run Maven on a Windows agent, use
            // bat "mvn -Dmaven.test.failure.ignore=true clean package"
         }// steps
      }//stage-build
      stage('Deploy') {
         steps{
                 echo "Deploying"
         }//steps
      } // stage-deploy

         post {
            // If Maven was able to run the tests, even if some of the test
            // failed, record the test results and archive the jar file.
            success {
               junit '**/target/surefire-reports/TEST-*.xml'
               archiveArtifacts 'target/*.jar'
            }//SUccess
         }//post
      }
   }


