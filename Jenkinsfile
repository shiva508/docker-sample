// node {
// 		echo "Build"
// 		echo "Test"
// 		echo "INT Test"
// }
pipeline{
		agent any
		stages{
				stage('Build'){
						steps{
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