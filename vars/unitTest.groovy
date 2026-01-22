def call(Map config = [:]) {

    String type = config.type ?: 'maven'
    String dir  = config.dir  ?: '.'

    echo "Running unit tests for ${type} project in directory: ${dir}"

    dir(dir) {
        if (type == 'maven') {
            sh 'mvn test'
        } else {
            error "Unsupported test type"
        }
    }
}

