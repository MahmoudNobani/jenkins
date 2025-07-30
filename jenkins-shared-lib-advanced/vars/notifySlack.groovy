def call(String status, String channel = '#builds') {
    def messageTemplate = libraryResource('templates/deploy-message.txt')
    def message = org.example.SlackFormatter.format(messageTemplate, status)

    echo "🔔 Notifying Slack (${channel}): ${message}"
    // sh "curl -X POST ... --data '${message}'" (fake curl)
}
