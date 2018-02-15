pipeline {
  agent {
    docker {
      image 'maven'
      args '-v /Users/fatih/.m2:root/.m2'
    }
    
  }
  stages {
    stage('build') {
      steps {
        sh 'mvn clean'
      }
    }
  }
}