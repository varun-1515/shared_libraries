@Library('shared_libraries') __

pipeline {
    agent { label 'linuxgitaws' }
    
    options {
        timestamps()
    }
    
    environment {
        DEPLOY_ENV = "prod"
    }
    
    stages {
        stage('Build') {
            steps {
                buildapp()
            }
        }
        stage('Deploy') {
            steps {
                deployapp(DEPLOY_ENV)
            }
        }
        stage('hello') {
            steps {
                hello('linux')
            }
        }
    }
    post {
        success {
            echo "Pipeline completed successfully"
        }
        failure {
            echo "Pipeline failed"
        }
    }
}

