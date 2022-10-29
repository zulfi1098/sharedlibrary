def call(Map config) {
def builders = [:]
  config.each() {
    builders[it] = {
                        stage(it){
                                 script { 
                                            echo 'Call of Shared Library paramater less'
                                        }
                        }
                    }
                                  
                    parallel builders
  }
}

def call() {
 
            script { 
                   echo 'Call of Shared Library paramater less'
            }
     
}

