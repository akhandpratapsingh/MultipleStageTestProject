pipeline {
  agent any
  tools {
    maven "Maven"
  }
  stages {
      stage("Test1") {
        steps {
		echo'Test1'
		sh 'mvn test -Dtest="ppmtests.*" -Dpublish'
		}
	post{
		success{
		  echo'Test1-success'
		  junit"**/target/surefire-reports/*ppmtests.*.xml"
		}
       	     } 
      }
      stage("Test2") {
        steps {
                 echo'Test2'
                 sh'mvn test -Dtest="unittests.*" -Dpublish'
              }
        post{
              success{
                echo'Test2-success'
                junit"**/target/surefire-reports/*unittests.*.xml"
              }
           } 
       }
  }
}
