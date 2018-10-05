pipeline {
	agent { label 'maven' }
	stages {
		stage ('dev build stage') {
			when {
				expression { return env.branch_name == "dev" || env.branch_name.contains("feature") } 
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
