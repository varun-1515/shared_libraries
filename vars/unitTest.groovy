def call(String type = 'maven') {
    echo "Running unit tests using ${type}"

    if (type == 'maven') {
        sh 'mvn test'
    } else {
        error "Unsupported test type"
    }
}

