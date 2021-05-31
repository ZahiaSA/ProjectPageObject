pipeline {
    agent any

    stages {
        stage('Execution rights') {
            steps {
                sh 'chmod +x gradlew'
            }
        }
        stage('Test') {
            steps {
              sh './gradlew clean test'
            }
        }
        stage('Deploy') {
            steps {
               publishHTML([allowMissing: false, alwaysLinkToLastBuild: false, keepAll: false, reportDir: 'build/reports/tests/test/', reportFiles: 'index.html', reportName: 'Test Report', reportTitles: ''])
            }
        }
    }
}