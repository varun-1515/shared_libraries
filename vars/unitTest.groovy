def call(Map config = [:]) {

    String testType = config.type ?: 'maven'
    String workDir  = config.dir  ?: '.'

    echo "Running unit tests for ${testType} project in directory: ${workDir}"

    dir(workDir) {
        if (testType == 'maven') {
            sh 'mvn test'
        } else {
            error "Unsupported test type: ${testType}"
        }
    }
}

