pipeline {
    agent {
        docker {
            image 'maven:3.6-alpine' 
            args '-u root -v /root/.m2:/root/.m2' 
        }
    }
    stages {
        stage('Build') { 
            steps {
                sh 'mvn -B -DskipTests clean package' 
            }
        }
    }
}
