def call() {
    // Print a message
    echo "Running this in vars"
    echo "Current build number is: ${env.BUILD_NUMBER}"
    def mvnUtil = new org.opstree.MavenBuild(this)
    mvnUtil.runSampleMethod()
}
