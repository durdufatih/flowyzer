def mvn_version = 'M3'

pipeline {
  agent any
  stages {
    stage('build') {
      agent any
      steps {
       withEnv( ["PATH+MAVEN=${tool mvn_version}/bin"] ) {
           sh "mvn clean"
        }
      }
    }
  }
}
