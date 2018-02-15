pipeline {
  agent any
  stages {
    stage('build') {
      agent {
        docker {
          image 'library/maven'
        }
        
      }
      steps {
        sh 'mvn clean'
      }
    }
  }
}