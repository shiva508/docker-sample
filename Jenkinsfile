// node {
// 		echo "Build"
// 		echo "Test"
// 		echo "INT Test"
// }
pipeline{
		agent any
		//agent { docker { image 'maven:3.6.3' } }
		stages{
				stage('Build'){
						steps{
							//sh 'mvn --version'
							echo "Build"
							echo "PATH - $PATH"
							echo "BUILD_NUMBER - $env.BUILD_NUMBER"
							echo "BUILD_ID - $env.BUILD_ID"
							echo "BUILD_TAG - $env.BUILD_TAG"
							echo "JOB_NAME- $env.JOB_NAME"
						}
				}
				stage('Test'){
						steps{
							echo "Test"
						}
				}
				stage('IntTest'){
						steps{
							echo "INT Test"
						}
				}
			}
		post{
			always{
					echo 'I WILL ALWAYS KEEP EYE ON YOU'
			}
			success{
					echo 'I WILL ALWAYS RUN ON BUILD SUCCESS'
			}
			failure{
					echo 'I WILL ALWAYS RUN ON BUILD FAILURE'
			}
		}
}