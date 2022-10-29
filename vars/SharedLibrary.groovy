def call() {

def allModules = ['module1', 'module2', 'module3', 'module4', 'module5']
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

def call(Map config) {
 
            script { 
                   echo 'Call of Shared Library paramater less'
            }
     
}

