def call(String name = 'World') {
    def banner = libraryResource('templates/banner.txt')
    echo banner
    echo "👋 Hello, ${name}!"
    echo "Pipeline ran for ${params.USERNAME}"
    //echo "${GREETING}" this owrks
    echo "${env.GREETING}"
}

def whereAreU(String loc = 'home') {
    echo " i am ${loc}"
}