def call(String status) {
    echo "Pipeline completed with status: ${status}"

    if (status == 'SUCCESS') {
        echo 'Build successful'
    } else {
        echo 'Build failed'
    }
}

