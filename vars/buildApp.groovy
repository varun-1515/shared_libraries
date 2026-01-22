
def call(Map config = [:]) {

    String buildType = config.type ?: 'maven'
    String workDir   = config.dir  ?: '.'

    echo "Building ${buildType} project in directory: ${workDir}"

    dir(workDir) {
        if (buildType == 'maven') {
            sh 'mvn clean package'
        } else {
            error "Unsupported build type: ${buildType}"
        }
    }
}

