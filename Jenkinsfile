pipeline {
  agent {
    docker {
      image 'maven'
      args '-v /Users/fatih/.m2:root/.m2'
    }
    
  }
  stages {
    stage('build') {
      agent {
        docker {
          args '-v /Users/fatih/.m2'
          image 'maven:3.3.9-jdk-8'
        }
        
      }
      steps {
        sh 'mvn clean'
      }
    }
  }
}