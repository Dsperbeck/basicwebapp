pipeline {
  agent {
    kubernetes {
      label 'maven'
    }
  }
	stages {
		stage ('dev build stage') {
			when {
				branch 'dev'
			}
			steps {
				echo 'dev branch'	
	
			}
		}
		stage ('stable build stage') {
			when {
				branch 'stable'
			}
			steps {
				echo 'stable branch'	
	
			}
		}
		stage ('master Deploy stage') {
			when {
				branch 'master'
			}
			steps {
				echo 'master branch'	
	
			}
		}
	}
}
