pipeline {
    agent any

    tools {
        maven 'Maven_3'
        jdk 'JDK17'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/your-org/ultimate-api-framework.git'
            }
        }

        stage('Build & Test') {
            steps {
                sh 'mvn clean test -Denv=QA'
            }
        }

        stage('Generate Allure Report') {
            steps {
                sh 'mvn allure:report'
            }
        }
    }

    post {
        always {
            allure includeProperties: false, jdk: '', results: [[path: 'target/allure-results']]
        }
    }
}
