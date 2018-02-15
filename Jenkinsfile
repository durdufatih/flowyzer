pipeline {
  agent any
  stages {
    stage('clean') {
      steps {
        sh '''echo PATH=${PATH}
echo M2_HOME = ${M2_HOME}
mvn clean'''
      }
    }
  }
}