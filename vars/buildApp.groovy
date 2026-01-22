
def call(Map config = [:]) {

    String type = config.type ?: 'maven'
    String dir  = config.dir  ?: '.'

    echo "Building ${type} project in directory: ${dir}"

    dir(dir) {
        if (type == 'maven') {
            sh 'mvn clean package'
        } else if (type == 'cmake') {
            sh '''
                mkdir -p build
                cd build
                cmake ..
                make
            '''
        } else {
            error "Unsupported build type: ${type}"
        }
    }
}
