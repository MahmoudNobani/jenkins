def call(String name = 'World') {
    def banner = libraryResource('templates/banner.txt')
    echo banner
    echo "👋 Hello, ${name}!"
}
