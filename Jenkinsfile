pipline {
    agent any
    tools{
        maven 'maven'
    }
    stages{
        stage('build'){
            steps{
                sh "mvn clean"
                sh "mvn compile"
            }
        }
    }
}