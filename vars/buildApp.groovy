def call(String type = 'maven') {
    echo "Building application using ${type}"

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

