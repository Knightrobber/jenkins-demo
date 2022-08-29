pipelineJob('theme-park-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/Knightrobber/spring-boot.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}