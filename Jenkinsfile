#!groovy

pipeline {
  agent any
  stages {
    stage('Initialize') {
      steps {
        nodejs(nodeJSInstallationName: 'node:8.2.1') {
          deleteDir()
          sh 'echo $PATH'
          sh 'npm -v'
          sh 'node -v'
          
          dir('src/webapp') {
            sh 'ls'
            sh 'npm install'
            sh 'npm start &'
          }
        }
      }
    }
    stage('Test') {
      steps {
        sh 'ls'
        sh './gradlew tasks'
        sh './gradlew clean test'
      }
    }
  }
}
