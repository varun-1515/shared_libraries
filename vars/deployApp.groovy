def call(String env = 'dev') {
    echo "Deploying application to ${env} environment"
    sh "echo Deploying to ${env}"
}

