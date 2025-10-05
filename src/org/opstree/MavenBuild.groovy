package org.opstree

class MavenBuild implements Serializable {

    def script

    // Constructor
    MavenBuild(script) {
        this.script = script
    }

    // Method to run Maven build
    def runSampleMethod() {
        script.echo "Starting Maven build"

        script.stage('Maven Compile') {
            script.echo "Running Maven compile"
            script.sh "mvn compile"
        }

        script.stage('Maven Test') {
            script.echo "Running Maven test"
            script.sh "mvn test"
        }

        script.stage('Maven Package') {
            script.echo "Running Maven package"
            script.sh "mvn package"
        }

        script.echo "Maven build completed successfully!"
    }
}
