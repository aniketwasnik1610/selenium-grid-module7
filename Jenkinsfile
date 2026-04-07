pipeline {
    agent any

    tools {
        jdk 'JDK17'
        maven 'Maven3'
    }

    stages {

        stage('Build') {
            steps {
                dir('Selenium_Grid') {
                    bat 'mvn clean compile'
                }
            }
        }

        stage('Test') {
            steps {
                dir('Selenium_Grid') {
                    bat 'mvn test'
                }
            }
        }

        stage('Results') {
            steps {
                junit 'Selenium_Grid/target/surefire-reports/*.xml'
            }
        }
    }
}