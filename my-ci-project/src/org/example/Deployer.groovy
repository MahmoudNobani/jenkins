package org.example

class Deployer implements Serializable {
   def steps
   Deployer(steps) {
      this.steps = steps
   }

    def callMe() {
        // Always call the steps object
        steps.echo("Test")
        steps.echo("${steps.env.BUILD_NUMBER}")
        steps.sh("ls -al")
    }
}