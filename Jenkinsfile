pipeline {
	agent {
		kubernetes {
			inheritFrom 'default'
			yaml '''
spec:
containers:
  - name: maven
    image: maven:3.9.5-eclipse-temurin-8-alpine
'''
		}
	}
	tools {
		maven 'maven'
	}
	stages {
		stage ('Initialize') {
			steps {
				sh '''
					echo "PATH = ${PATH}"
					echo "M2_HOME = ${M2_HOME}"
				'''
			}
		}

		stage ('Build') {
			steps {
				sh 'mvn -Dmaven.test.failure.ignore=true install' 
			}
		}
	}
}
