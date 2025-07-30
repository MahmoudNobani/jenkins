def call(String env) {
    echo "🚀 Starting deployment for: ${env}"

    def configJson = libraryResource("config/deployment-config.json")
    def config = new groovy.json.JsonSlurper().parseText(configJson)

    if (!config[env]) {
        error("❌ No deployment config found for ${env}")
    }

    def host = config[env].host
    def port = config[env].port

    echo "Deploying to ${host}:${port}"
    sh "ssh deploy@${host} 'docker restart myapp'"
}
