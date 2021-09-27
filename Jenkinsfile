// node {
// 		echo "Build"
// 		echo "Test"
// 		echo "INT Test"
// }
pipeline{
		//agent any
		agent {docker { image 'maven:3.6.3'}}
		stages{
				stage('Build'){
						steps{
							echo "mvn --version"
							echo "Build"
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
			failue{
					echo echo 'I WILL ALWAYS RUN ON BUILD FAILURE'
			}
		}
}