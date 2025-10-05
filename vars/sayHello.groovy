def call(String name) {
    echo "Running this in vars by ${name}"
    echo "Current build number is: ${env.BUILD_NUMBER}"
}
