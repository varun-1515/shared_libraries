
def call() {
    echo 'Installing basic tools...'
    sh '''
        sudo apt-get update -y
        sudo apt-get install -y git curl
    '''
}

