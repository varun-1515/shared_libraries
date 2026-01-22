def call(Map config = [:]) {
    git branch: config.branch ?: 'main',
        url: config.url,
        credentialsId: config.credentialsId
}
